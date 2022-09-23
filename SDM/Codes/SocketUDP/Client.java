import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Kakugawa
 */
public class Client {

    static DatagramSocket clientSocket;
    static InetAddress enderecoIP;
    
    public Client() throws Exception {
        try {
            clientSocket = new DatagramSocket();    // fase de conexão
            enderecoIP = InetAddress.getByName("localhost");
        } catch (Exception e) {
            System.out.println("Nao consegui resolver o host...");
        }
    }
    
    public static void main(String args[]) throws Exception {
        BufferedReader entradaUsuario
                = new BufferedReader(new InputStreamReader(System.in));
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];
        System.out.print("Digite sua mensagem:");
        String textoAEnviar = entradaUsuario.readLine();
        System.out.println("");
        sendData = textoAEnviar.getBytes();
        
        new Client();
        DatagramPacket pacoteEnvio = new DatagramPacket(sendData, sendData.length, enderecoIP, 9876);
        clientSocket.send(pacoteEnvio);
        DatagramPacket pacoteRecebido = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(pacoteRecebido);
        String textoRecebido = new String(pacoteRecebido.getData());
        System.out.println("Do servidor: " + textoRecebido);
        clientSocket.close();
    }
}

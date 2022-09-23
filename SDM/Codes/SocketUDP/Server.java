import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Kakugawa
 */
public class Server {

    static DatagramSocket serverSocket;
    static DatagramPacket clientPacket;

    public Server() {
        try {
            serverSocket = new DatagramSocket(9876);
            System.out.println("Criando o Server Socket");
        } catch (Exception e) {
            System.out.println("Nao criei o server socket..." + e);
        }
    }

    public static void main(String args[]) throws Exception {
        byte[] arquivoRecebido = new byte[1024];
        byte[] arquivoEnviado = new byte[1024];
        new Server();
        clientPacket = new DatagramPacket(arquivoRecebido, arquivoRecebido.length);
        serverSocket.receive(clientPacket);
        String textoRecebido = new String(clientPacket.getData());
        System.out.println("Texto Recebido: " + textoRecebido);
        InetAddress IPAddress = clientPacket.getAddress();
        int porta = clientPacket.getPort();
        String textoEnviado = "ok " + textoRecebido;
        arquivoEnviado = textoEnviado.getBytes();
        DatagramPacket envio
                = new DatagramPacket(arquivoEnviado, arquivoEnviado.length, IPAddress, porta);
        serverSocket.send(envio);
        
        serverSocket.close();
    }
}

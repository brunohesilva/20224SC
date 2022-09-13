
import java.io.*;
import java.net.*;

public class Servidor {

    static ServerSocket serversocket;
    static Socket client_socket;
    static Conexao conexao;
    static String msg;

    public Servidor() {

        try {
            serversocket = new ServerSocket(9600);
            System.out.println("Criando o Server Socket");
        } catch (Exception e) {
            System.out.println("Nao criei o server socket...");
        }
    }

    public static void main(String args[]) {
        String texto;
        String resposta = "Servidor Envia: Ola, Cliente ";
        new Servidor();
        if (connect()) {
            for (int i = 0; i < 10; i++) {
                texto = conexao.receive(client_socket);                     //
                System.out.println(texto);                            // fase de dados
                conexao.send(client_socket, resposta);
            }
            try {
                client_socket.close();
                serversocket.close();
            } // desconexao
            catch (Exception e) {
                System.out.println("Nao encerrou a conexao corretamente" + e.getMessage());
            }
        }
    }

    static boolean connect() {
        boolean ret;
        try {
            client_socket = serversocket.accept();              // fase de conexão
            ret = true;
        } catch (Exception e) {
            System.out.println("Nao fez conexao" + e.getMessage());
            ret = false;
        }
        return ret;
    }
}

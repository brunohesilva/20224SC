import java.io.*;
import java.net.*;

public class Cliente {

    static Conexao conexao;
    static Socket socket;

    public Cliente() {
        try {
            socket = new Socket("localhost", 9600);
        } // fase de conexao
        catch (Exception e) {
            System.out.println("Nao consegui resolver o host...");
        }
    }

    public static void main(String args[]){
        String requisicao = "Cliente envia : Ola, Servidor ";
        String texto;
        new Cliente();
        for (int i = 0; i < 10; i++) {
            conexao.send(socket, requisicao);
            texto = conexao.receive(socket);                    // fase de dados
            System.out.println(texto);
        }
        try {
            socket.close();                               // fase de desconexao
        } catch (IOException e) {
            System.out.println("Nao encerrou a conexao corretamente" + e.getMessage());
        }
    }
}

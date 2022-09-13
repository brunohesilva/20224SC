import java.net.*;
import java.io.*;

public class Conexao {

    public static void send(Socket socket, String txt) {
        OutputStream out;
        try {
            out = socket.getOutputStream();
            out.write(txt.getBytes());
        } catch (Exception e) {
            System.out.println("Excecao no OutputStream");
        }
    }

    public static String receive(Socket socket) {
        InputStream in;
        int bt;
        byte btxt[];
        String txt = "";
        btxt = new byte[79];
        try {
            in = socket.getInputStream();
            bt = in.read(btxt);
            if (bt > 0) {
                txt = new String(btxt);
            }
        } catch (Exception e) {
            System.out.println("Excecao no InputStream: " + e);
        }
        return txt;
    }
}
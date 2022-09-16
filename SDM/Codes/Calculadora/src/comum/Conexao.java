package comum;

import java.net.*;
import java.io.*;

public class Conexao {

    public static void send(Socket socket, Object obj) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(obj);
        } catch (Exception e) {
            System.err.println("Excecao no OutputStream");
        }
    }

    public static Object receive(Socket socket) {
        
        Object obj = null;
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            obj = in.readObject();
            
        } catch (Exception e) {
            System.err.println("Excecao no InputStream: " + e);
        }
        return obj;
    }
}
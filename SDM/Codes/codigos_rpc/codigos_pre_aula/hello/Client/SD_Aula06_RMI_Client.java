/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author biizuka
 */
public class SD_Aula06_RMI_Client {

    private SD_Aula06_RMI_Client() {
    }

    public static void main(String[] args) {
        try {
            // Pegando o registro 
            Registry registry = LocateRegistry.getRegistry("localhost", 18000);

            // Procurando por um registro que utilize a Interface Hello
            Hello stub = (Hello) registry.lookup("Hello");

            // Chamando o método remoto 
            stub.printMsg();

        } catch (Exception e) {
            System.err.println("Exceção do Cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}

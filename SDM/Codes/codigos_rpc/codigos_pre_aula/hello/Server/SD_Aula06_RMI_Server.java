/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author bmoritani
 */
public class SD_Aula06_RMI_Server {

    public static void main(String args[]) {
        try {
            // Instanciação
            HelloImpl obj = new HelloImpl();

            // Exportando o objeto para o stub
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Binding o objeto remoto (stub) no registro
            Registry registry = LocateRegistry.createRegistry(18000);
            registry.rebind("Hello", stub);

            System.err.println("Servidor Pronto");
        } catch (Exception e) {
            System.err.println("Exceção do Servidor: " + e.toString());
            e.printStackTrace();
        }
    }
    
}

package atividade.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AppServidor {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registro registro = new RegistroImpl();
            Naming.rebind("rmi://localhost:1099/Chamada", registro);
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }
}

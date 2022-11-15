
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AppServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registro registro = new RegistroImp();
            Naming.rebind("rmi://localhost:1099/Portaria", registro);
            System.out.println("vs > netbeans");
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());

        }
    }
}

import java.rmi.Naming;

public class AppServidor {

    public static void main(String[] args) {
    	try {
        	Servidor m = new ServidorImpl();
            Calculadora c = new CalculadoraImpl();
        	
        	// crio uma instancia do obj e registro no Binder
            Naming.rebind("rmi://localhost:1099/Servidor", m);
            Naming.rebind("rmi://localhost:1098/Calcular", c);
        } catch( Exception e ) {
        	System.out.println( "Trouble: " + e.getMessage() );
        }
    }
}
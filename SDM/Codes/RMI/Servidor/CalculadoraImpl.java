import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora{

    public CalculadoraImpl() throws RemoteException {
        super();
    }
 
    public Integer soma(Integer x, Integer y) throws RemoteException {
        return x + y;
    }
    public Integer sub(Integer x, Integer y) throws RemoteException { 
        return x - y;
    }
    public Integer mult(Integer x, Integer y) throws RemoteException {
        return x * y;
    }
    public Integer div(Integer x, Integer y) throws RemoteException {
        return x / y;
    }
}

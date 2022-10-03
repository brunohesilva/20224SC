import java.rmi.*;

public interface Calculadora extends Remote {

    public Integer soma(Integer x, Integer y) throws RemoteException;

    public Integer sub(Integer x, Integer y) throws RemoteException;

    public Integer mult(Integer x, Integer y) throws RemoteException;

    public Integer div(Integer x, Integer y) throws RemoteException;
}

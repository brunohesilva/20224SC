import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.Scanner;

public interface Registro extends Remote  {

    public void add(Morador morador) throws RemoteException;

    public boolean find(int IdNumero) throws RemoteException;

    public void delete(int morIdNumero) throws RemoteException;

    public Morador findMorador(int IdNumero) throws RemoteException;

    public void update(int id, int novoId, String novoNome, int novoContato) throws RemoteException;

    public void display() throws RemoteException;
}

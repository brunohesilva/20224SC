
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class RegistroImp extends UnicastRemoteObject implements Registro, Serializable {

    LinkedList<Morador> list;

    public RegistroImp() throws RemoteException {
        list = new LinkedList<>();
    }

    @Override
    public void add(Morador morador) throws RemoteException {
        if (!find(morador.getIdNumero())) {
            list.add(morador);
            System.out.print(morador.toString());
        } else {
            System.out.println("Morador já existe nos Registros");
        }
    }

    @Override
    public boolean find(int IdNumero) throws RemoteException {
        for (Morador l : list) {
            if (l.getIdNumero() == IdNumero) {
                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(int morIdNumero) throws RemoteException {
        Morador recordDel = null;
        for (Morador ll : list) {
            if (ll.getIdNumero() == morIdNumero) {
                recordDel = ll;
            }
        }
        if (recordDel == null) {
            System.out.println("IdNumro inválido");
        } else {
            list.remove(recordDel);
            System.out.println("Morador removido da lista");
        }
    }

    @Override
    public Morador findMorador(int IdNumero) throws RemoteException {
        for (Morador l : list) {
            if (l.getIdNumero() == IdNumero) {
                return l;
            }
        }
        return null;
    }

    @Override
    public void update(int id, int novoId, String novoNome, int novoContato) throws RemoteException {

        for (Morador morador : list) {
            if (morador.getIdNumero() == id) {

                morador.setIdNumero(novoId);

                morador.setNome(novoNome);

                morador.setNumeroContato(novoContato);

                System.out.println("Registro do Morador atualizado com sucesso!");
            }
        }
    }

    @Override
    public void display() throws RemoteException {
        if (list.isEmpty()) {
            System.out.println("Não há registros na lista\n");
        } else {
            for (Morador morador : list) {
                System.out.println(morador.toString());
            }
        }
    }
}

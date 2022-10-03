import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject – Objeto Remoto Unicast

public class ServidorImpl extends UnicastRemoteObject implements Servidor{

	// todas as classes remotas (servidores) herdam UnicastRemoteObject e implementam a interface definida
	public ServidorImpl() throws RemoteException {
		// construtor – necessito chamar o construtor da superclasse
		super(); 
	}
	
	public String montaMensagem(String str) throws RemoteException {
		System.out.println("executando MONTA MENSAGEM");		
		return "Montagem: "+str.toString();
	}
	
	public String inverteMensagem(String str) throws RemoteException {
		System.out.println("executando INVERTE MENSAGEM");
		String invertido = "";
		for(int i = str.length()-1; i>=0; i--){
				invertido = invertido + str.charAt(i);
		}	
		return invertido;
	}
}
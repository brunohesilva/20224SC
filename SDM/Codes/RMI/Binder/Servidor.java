import java.rmi.*; // importa pacotes do RMI

public interface Servidor extends Remote // necessita herdar para obter invoca��o remota
{
	// todos os m�todos remotos necessitam lan�ar uma exce��o deste tipo
	public String montaMensagem(String str) throws RemoteException;
	
	public String inverteMensagem(String str) throws RemoteException;

}

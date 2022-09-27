/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;

/**
 *
 * @author bmoritani
 */
public interface Calculadora extends Remote {
    
    public int soma(int a, int b) throws java.rmi.RemoteException;
    
    public int subtrai(int a, int b)throws java.rmi.RemoteException;
    
    public int multiplica(int a, int b) throws java.rmi.RemoteException;
    
    public double dividi(int a, int b) throws java.rmi.RemoteException;
    
}

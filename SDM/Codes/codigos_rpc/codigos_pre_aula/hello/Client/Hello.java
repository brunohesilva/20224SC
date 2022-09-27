/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author biizuka
 */
// Criando uma Interface Remota da aplicação
public interface Hello extends Remote {  
    
   void printMsg() throws RemoteException; 
   
}

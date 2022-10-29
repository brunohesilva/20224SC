/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi.binder;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author profslpa
 */
public interface Calculadora extends Remote{
    public Resposta soma(Requisicao requisicao) throws RemoteException;
    public Resposta sub(Requisicao requisicao) throws RemoteException;
    public Resposta mult(Requisicao requisicao) throws RemoteException;
    public Resposta div(Requisicao requisicao) throws RemoteException;
}

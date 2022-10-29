/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi.servidor;

import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmi.binder.*;
/**
 *
 * @author profslpa
 */
public class AppServidor {
    public static void main(String[] args) throws RemoteException, MalformedURLException{
        LocateRegistry.createRegistry(1099);
        Calculadora calculadora = new CalculadoraImpl();
        Naming.rebind("rmi://localhost:1099/Calculadora", calculadora);
    }
}

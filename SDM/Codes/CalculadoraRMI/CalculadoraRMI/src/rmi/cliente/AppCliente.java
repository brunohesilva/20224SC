/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi.cliente;

import rmi.binder.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
/**
 *
 * @author profslpa
 */
public class AppCliente {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Calculadora calculadora = (Calculadora)Naming.lookup("rmi://localhost:1099/Calculadora");
        
        Requisicao requisicao = new Requisicao(3,0);
        Resposta resposta = calculadora.soma(requisicao);
        Resposta r1 = calculadora.sub(requisicao);
        Resposta r2 = calculadora.mult(requisicao);
        Resposta r3 = calculadora.div(requisicao);
        
        System.out.println("Status do R3: "+r3.getStatus());
        
        System.out.println("Soma:"+resposta.getResultado());
        System.out.println("Soma:"+r1.getResultado());
        System.out.println("Soma:"+r2.getResultado());
        System.out.println("Soma:"+r3.getResultado());
        
    }
}

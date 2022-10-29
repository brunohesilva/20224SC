/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi.servidor;

import rmi.binder.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author profslpa
 */
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora{
    
    public CalculadoraImpl() throws RemoteException{
        super();
    }
    
    public Resposta soma(Requisicao requisicao) throws RemoteException{
        Resposta resposta=new Resposta();
        float resultado = requisicao.getNum1() + requisicao.getNum2();
        resposta.setResultado(resultado);
        resposta.setStatus(0);
        return resposta;
    }
    
    public Resposta sub(Requisicao requisicao) throws RemoteException{
        Resposta resposta=new Resposta();
        float resultado = requisicao.getNum1() - requisicao.getNum2();
        resposta.setResultado(resultado);
        resposta.setStatus(0);
        return resposta;
    }
    
    public Resposta mult(Requisicao requisicao) throws RemoteException{
        Resposta resposta=new Resposta();
        float resultado = requisicao.getNum1() * requisicao.getNum2();
        resposta.setResultado(resultado);
        resposta.setStatus(0);
        return resposta;
    }
    
    public Resposta div(Requisicao requisicao) throws RemoteException{
        Resposta resposta = new Resposta();
        
        if(requisicao.getNum2()!=0){
            float resultado = requisicao.getNum1() / requisicao.getNum2();
            resposta.setResultado(resultado);
            resposta.setStatus(0);
            return resposta;
        }
        else{
            resposta.setStatus(2);
            return resposta;
        }
    }
}

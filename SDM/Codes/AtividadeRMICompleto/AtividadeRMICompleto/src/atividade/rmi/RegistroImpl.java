/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.rmi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kakugawa
 */
public class RegistroImpl extends UnicastRemoteObject implements Registro{
    
    private ArrayList<String> registros;
    
    public RegistroImpl() throws RemoteException{
        super();
        registros = new ArrayList<String>();
    }
    
    public Resposta insert(Aluno aluno)throws RemoteException{

        
        Resposta resposta = new Resposta();
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        DateFormat dia = new SimpleDateFormat("dd/MM/yyyy");
        
        
        if(registros.contains(aluno.getAddr().getHostAddress())){
            resposta.setMensagem(aluno.getAddr().getHostAddress()+" já foi registrado!!!! \nFoi utilizado por "+aluno.getNome());
            resposta.setFlag(false);
            return resposta;
        }
        else{
            resposta.setProtocolo(System.currentTimeMillis());
            registros.add(aluno.getAddr().getHostAddress());
            HandleFile hf = new HandleFile();
            hf.setData(aluno.getNome()+"\t"+
                       aluno.getRa()+"\t"+
                       aluno.getAddr().getHostAddress()+"\t"+
                       hora.format(aluno.getDate())+"\t"+
                       +resposta.getProtocolo()+"\n");

            System.out.println("\n*******************************");
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("RA: "+aluno.getRa());
            System.out.println("From: "+aluno.getAddr().getHostAddress());
            System.out.println("Data: "+hora.format(aluno.getDate()));
            System.out.println("Protocolo: "+resposta.getProtocolo());
            System.out.println("*******************************");

            resposta.setFlag(true);
            String mensagem = "############################################################\n"+
                               "Message from KAKUGAWA server:\n"+
                               "Protocolo presença "+resposta.getProtocolo()+
                               "\nOla "+aluno.getNome()+", esta com presenca para o dia "+dia.format(aluno.getDate())+
                               "\n############################################################";
            resposta.setMensagem(mensagem);
            return resposta;
        }
        
    }
}

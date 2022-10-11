package atividade.rmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kakugawa
 */
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class Aluno implements Serializable{
    private String nome;
    private String ra;
    private InetAddress addr;
    private Date date;
    
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
        try {
            addr = InetAddress.getLocalHost();
            date = new Date(System.currentTimeMillis());

        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public InetAddress getAddr() {
        return addr;
    }

    public Date getDate() {
        return date;
    }
}
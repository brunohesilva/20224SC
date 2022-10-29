/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.rmi;

import java.io.Serializable;

/**
 *
 * @author Kakugawa
 */
public class Resposta implements Serializable{
    private String mensagem;
    private boolean flag;
    private long protocolo;
    
    public Resposta(){
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public long getProtocolo(){
        return protocolo;
    }
    
    public void setProtocolo(long valor){
        this.protocolo = valor;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi.binder;

import java.io.Serializable;

/**
 *
 * @author profslpa
 */
public class Resposta implements Serializable{
    private float resultado;
    private int status;

    public Resposta() {
    }

    public Resposta(float resultado, int status) {
        this.resultado = resultado;
        this.status = status;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}

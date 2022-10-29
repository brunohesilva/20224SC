/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Kakugawa
 */
public interface Registro extends Remote{
    
    public Resposta insert(Aluno aluno) throws RemoteException;
}
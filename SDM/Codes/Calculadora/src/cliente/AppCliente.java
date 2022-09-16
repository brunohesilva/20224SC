/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import comum.Conexao;
import comum.Requisicao;
import comum.Resposta;
import java.io.IOException;
import java.net.Socket;
/**
 *
 * @author profslpa
 */
public class AppCliente {
    static Socket socket;
    
    public AppCliente(){
        try {
            socket = new Socket("localhost", 9600);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        Requisicao requisicao = new Requisicao('+', 30003, 4987);
        Resposta resposta = new Resposta();
        new AppCliente();
        
        Conexao.send(socket, requisicao);
        resposta = (Resposta)Conexao.receive(socket);
        
        System.out.println("O resultado eh: "+resposta.getResultado());
    }
}

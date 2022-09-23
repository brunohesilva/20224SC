/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import comum.Conexao;
import comum.Requisicao;
import comum.Resposta;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author profslpa
 */
public class AppServidor {
    
    static Socket client_socket;
    static ServerSocket server_socket;
    
    public AppServidor(){
        try {
            server_socket = new ServerSocket(9600);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao();
        Resposta resposta = new Resposta();
        
        System.out.println("Servidor entrando no ar ....");
        while(true){
            new AppServidor();
            if (connect()) {
                requisicao = (Requisicao) Conexao.receive(client_socket);

                switch (requisicao.getOperacao()) {
                    case '+':
                        resposta.setResultado(requisicao.getNum1() + requisicao.getNum2());
                        resposta.setStatus(0);
                        System.out.println("Vai fazer " + requisicao.getNum1() + " + " + requisicao.getNum2());
                        System.out.println("E o resultado eh: " + resposta.getResultado());
                        break;
                    case '-':
                        resposta.setResultado(requisicao.getNum1() - requisicao.getNum2());
                        resposta.setStatus(0);
                        System.out.println("REALIZANDO SUBTRACAO!!!");
                        break;
                    case '*':
                        resposta.setResultado(requisicao.getNum1() * requisicao.getNum2());
                        resposta.setStatus(0);
                        System.out.println("REALIZANDO MULTIPLICACAO!!!");
                        break;
                    case '/':
                        if(requisicao.getNum2()!=0){
                            resposta.setResultado(requisicao.getNum1() / requisicao.getNum2());
                            resposta.setStatus(0);
                            System.out.println("Realiando divisao");
                        }
                        else{
                            resposta.setStatus(2);
                            System.out.println("o jumento tentou fazer divisao por zero");
                        }
                        break;
                    default:
                        resposta.setStatus(1);
                        System.out.println("O carinha tentou fazer uma operacao que nao foi implementada!!!");
                        break;
                }
                Conexao.send(client_socket, resposta);

                try {
                    server_socket.close();
                    client_socket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
        
    public static boolean connect(){
        try {
            client_socket = server_socket.accept();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

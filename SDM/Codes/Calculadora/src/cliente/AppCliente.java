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
import java.util.Scanner;
/**
 *
 * @author profslpa
 * 10.0.4.111
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
        
        Resposta resposta = new Resposta();
        boolean continuar = true;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Calculadora distribuida");
        do{
            System.out.println("Digite o primeiro numero");
            float num1 = in.nextFloat();
            System.out.println("Digite o segundo numero");
            float num2 = in.nextFloat();
            System.out.println("Digite a operacao que deseja realizar");
            System.out.println("(+)SOMA (-)SUB (*)MULT (/)DIV");
            char operacao = in.next().charAt(0);
            
            Requisicao requisicao = new Requisicao(operacao, num1, num2);
            
            new AppCliente();
            Conexao.send(socket, requisicao);
            resposta = (Resposta) Conexao.receive(socket);
            
            switch(resposta.getStatus()){
                case 0:
                    System.out.println("o resultado da continha eh: "+resposta.getResultado());
                    break;
                case 1:
                    System.out.println("Amiguinho, essa operacao ainda nao foi implementada");
                    break;
                case 2:
                    System.out.println("Jumento, nao faca divisao por zero, vai dar pau na app");
                    break;
            }
            
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            System.out.println("Deseja continuar?? (s)im (n)ao");
            char finalizar = in.next().charAt(0);
            if(finalizar == 'n')
                continuar = false;
            
        }while(continuar);

    }
}

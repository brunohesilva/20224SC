
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author bmoritani
 */
public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // Pegando o registro 
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 18000);

            // Procurando por um registro que utilize a Interface Hello
            Calculadora stub = (Calculadora) registry.lookup("Calculadora");

            System.out.println("Digite o primeiro valor:");
            int a = sc.nextInt();
            System.out.println("Digite o segundo valor:");
            int b = sc.nextInt();
            // Chamando o método remoto 
            int soma = stub.soma(a, b);
            int subtrai = stub.subtrai(a, b);
            int multiplica = stub.multiplica(a, b);
            double dividi = stub.dividi(a, b);

            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtrai);
            System.out.println("Multiplicação: " + multiplica);
            System.out.println("Soma: " + soma);

            
        } catch (Exception e) {
            System.err.println("Exceção do Cliente: " + e.toString());
            e.printStackTrace();
        }

        public static void realizarOperacao(Scanner sc, Calculadora stub, int operacao) {
            try {
                System.out.println("Digite o primeiro valor:");
                int a = sc.nextInt();
                System.out.println("Digite o segundo valor:");
                int b = sc.nextInt();

                double resultado = 0;
                switch(operacao) {
                    case 1:
                    resultado = stub.soma(a, b);
                    break;
                }
                switch(operacao) {
                    case 2:
                    resultado = stub.subtrai(a, b);
                    break;
                }
                switch(operacao) {
                    case 3:
                    resultado = stub.multiplica(a, b);
                    break;
                }
                switch(operacao) {
                    case 4:
                    resultado = stub.dividi(a, b);
                    break;
                } catch (Exception e) {
                System.err.println("Exceção do Cliente: " + e.toString());
                e.printStackTrace();
            }
            }
        }
    }
}

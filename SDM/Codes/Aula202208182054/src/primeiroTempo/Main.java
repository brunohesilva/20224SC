package primeiroTempo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Automovel a = new Automovel("Kakugawa", "Uno", "PPP3P33", 2022);
        
        System.out.println(a.imprimir());
        
        System.out.println(a.alterarProprietario("Karina"));
        
        System.out.println(a.imprimir());
        
        Automovel a2 = Mudanca.transferenciaProprietario(a,"Giovani");
        
        if(a2 != null)
            System.out.println(a2.imprimir ());
        else
            System.out.println("A transferencia não foi efetuada");
        
    }
}

package atividade.rmi;

import java.rmi.*;

public class AppCliente {
    
    public static void main(String args[]) throws Exception {

        try {

            Aluno bruno = new Aluno("Bruno Henrique Silva", "125111347384");

            Registro r = (Registro) Naming.lookup("rmi://10.159.123.18:1099/Chamada");

            Resposta resposta = r.insert(bruno);

            System.out.println(resposta.getMensagem()); 
        } catch (Exception e) {
            System.out.println("GenericException: " + e.toString());
        }
        
    }
}

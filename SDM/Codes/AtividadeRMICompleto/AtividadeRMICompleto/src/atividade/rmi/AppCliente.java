package atividade.rmi;

import java.rmi.*;

public class AppCliente {

    public static void main(String args[]) {
        try {
            Registro registro = (Registro) Naming.lookup("rmi://localhost:1099/Chamada");

            Aluno aluno = new Aluno("Creitinho", "2222222");
            Resposta resposta = registro.insert(aluno);
            if (resposta.isFlag()) {
                System.out.println(resposta.getMensagem());
            }
            else{
                System.out.println(resposta.getMensagem());
            }

        } catch (Exception e) {
            System.out.println("GenericException: " + e.toString());
        }
    }
}

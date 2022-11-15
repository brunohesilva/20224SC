
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class AppClient {

    public static void main(String[] args) {
        try {

            Registro registro = (Registro) Naming.lookup("rmi://localhost:1099/Portaria");

            Morador morador = new Morador();

            Scanner input = new Scanner(System.in);

            RegistroImp ri = new RegistroImp();

            int option = 0;

            do {
                menu();
                option = input.nextInt();

                switch (option) {
                    case 1:

                        System.out.print("Qual seria seu Número de Identificação ? ");
                        int IdNumero = input.nextInt();

                        System.out.print("Qual seria seu Número para contato ? ");
                        int NumeroContato = input.nextInt();
                        input.nextLine();

                        System.out.print("Qual seria o seu Nome ? ");
                        String Nome = input.nextLine();

                        morador = new Morador(Nome, IdNumero, NumeroContato);

                        registro.add(morador);
                        System.out.println(morador.toString());
                        break;

                    case 2:

                        System.out.print("Qual o seu número de identificação ? ");
                        int mId = input.nextInt();

                        registro.delete(mId);
                        break;

                    case 3:
                        System.out.print("Qual o número de identificação ? ");
                        int mIdNo = input.nextInt();
                        registro.update(mIdNo, input);
                        break;

                    case 4:
                        System.out.print("Qual o seu número de identificação ? ");
                        int bookId = input.nextInt();

                        if (!registro.find(bookId)) {
                            System.out.println("Numéro de identificação inexistente.\n");
                        }
                        break;

                    case 5:
                        registro.toString();
                        break;

                    case 9:
                        System.out.println("\nObrigador por utilizar nosso Sistema!\n");
                        System.exit(0);

                        break;

                    default:
                        System.out.println("\nOpção inexistente\n");
                        break;

                }
            } while (option != 9);

        } catch (Exception e) {
            System.out.println("GenericException: " + e.toString());
        }
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1: Adicionar um Morador");
        System.out.println("2: Deletar um Morador");
        System.out.println("3: Atualizar um Morador");
        System.out.println("4: Procurar um Morador");
        System.out.println("5: Listar Moradores");
        System.out.println("9: Sair");
        System.out.println("Escolha um opção acima : ");

    }
}

import java.rmi.*;
import java.util.Scanner;

public class AppCliente {
	public static void main(String args[]) throws Exception {
		try {
			// acesso o Binder pelo nome que fora registrado
			// Servidor m = (Servidor) Naming.lookup("rmi://localhost:1099/Servidor");
			Calculadora c = (Calculadora) Naming.lookup("rmi://localhost:1098/Calcular");
			// m�todo utilizado normalmente

			Scanner sc = new Scanner(System.in);
			sc.close();

			while (true) {

				System.out.println("\n1.Adição\n2.Subtração\n3.Multiplicação\n4.Divisão\n5.Sair");
				System.out.println("Escolha uma opção: ");
				int opc = sc.nextInt();

				if (opc == 5) {
					break;
				}

				System.out.println("Digite o primeiro número: ");
				int a = sc.nextInt();
				System.out.println("Digite o segundo número: ");
				int b = sc.nextInt();

				switch (opc) {
					case 1:
						c.soma(a, b);
						System.out.println("Resultado é: " + c);
						break;
					case 2:
						c.sub(a, b);
						System.out.println("Resultado é: " + c);
						break;
					case 3:
						c.mult(a, b);
						System.out.println("Resultado é: " + c);
						break;
					case 4:
						c.div(a, b);
						System.out.println("Resultado é: " + c);
						break;
				}
			}
			// System.out.println(m.montaMensagem("Ola!"));
			// System.out.println(m.inverteMensagem("kakugawa"));
		} catch (Exception e) {
			System.out.println("GenericException: " + e.toString());
		}
	}
}
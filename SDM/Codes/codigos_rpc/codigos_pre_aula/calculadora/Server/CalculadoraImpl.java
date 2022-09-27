/**
 *
 * @author bmoritani
 */
public class CalculadoraImpl implements Calculadora {

    public int soma(int a, int b) throws java.rmi.RemoteException{
        System.out.println("A = " + a + " =====  B = " + b);
        return a + b;
    }

    public int subtrai(int a, int b) throws java.rmi.RemoteException {
        System.out.println("A = " + a + " =====  B = " + b);
        return a - b;
    }

    public int multiplica(int a, int b) throws java.rmi.RemoteException{
        System.out.println("A = " + a + " =====  B = " + b);
        return a * b;
    }

    public double dividi(int a, int b) throws java.rmi.RemoteException{
        System.out.println("A = " + a + " =====  B = " + b);
        return a / b;
    }

}

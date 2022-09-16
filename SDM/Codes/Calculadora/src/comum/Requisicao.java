package comum;


import java.io.Serializable;


/**
 *
 * @author profslpa
 */
public class Requisicao implements Serializable{
    private char operacao;
    private float num1;
    private float num2;

    public Requisicao() {
    }

    public Requisicao(char operacao, float num1, float num2) {
        this.operacao = operacao;
        this.num1 = num1;
        this.num2 = num2;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}

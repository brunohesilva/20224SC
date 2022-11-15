import java.io.Serializable;

public class Morador implements Serializable {

    private String Nome;
    private int IdNumero;
    private int NumeroContato;

    public Morador() {
    }

    public Morador(String Nome, int IdNumero, int NumeroContato) {
        this.Nome = Nome;
        this.IdNumero = IdNumero;
        this.NumeroContato = NumeroContato;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdNumero() {
        return IdNumero;
    }

    public void setIdNumero(int IdNumero) {
        this.IdNumero = IdNumero;
    }

    public int getNumeroContato() {
        return NumeroContato;
    }

    public void setNumeroContato(int NumeroContato) {
        this.NumeroContato = NumeroContato;
    }

    @Override
    public String toString() {
        return "Morador{" + "Nome=" + Nome + ", IdNumero=" + IdNumero + ", NumeroContato=" + NumeroContato + ']';
    }
}

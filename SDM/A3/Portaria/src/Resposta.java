
import java.io.Serializable;

public class Resposta implements Serializable {

    private String Mensagem;

    public Resposta() {
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }
}

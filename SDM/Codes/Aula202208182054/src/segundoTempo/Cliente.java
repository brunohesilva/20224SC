
package segundoTempo;

/**
 *
 * @author Fernando
 */
public class Cliente extends Pessoa{
    private float saldo;
    
    public Cliente(){
        super();
    }
    
    public Cliente(String nome, int idade, float saldo){
        super(nome, idade);
        this.saldo = saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public String imprimir(){
        return super.imprimir()+"\n"+
               "SALDO: "+saldo;
    }
}

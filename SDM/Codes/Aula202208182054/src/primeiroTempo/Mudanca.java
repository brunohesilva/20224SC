package primeiroTempo;

public class Mudanca{
    
    public static Automovel transferenciaProprietario(Automovel a, String novoProprietario){
        if(a.alterarProprietario(novoProprietario))
            return a;
        else
            return null;
    }
}
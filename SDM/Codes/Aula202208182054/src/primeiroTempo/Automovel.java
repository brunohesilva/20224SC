package primeiroTempo;

public class Automovel{
    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;
    
    public Automovel(){ 
    }
    
    public Automovel(String nomeProprietario, String modelo, String placa, int ano){
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    private void setNomeProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }
    
    public String getNomeProprietario(){
        return nomeProprietario;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    //alterar proprietario
    public boolean alterarProprietario(String novoProprietario){
        this.setNomeProprietario(novoProprietario);
        return true;
    }
    
    //imprimir dados do automovel
    public String imprimir(){
        return "NOME PROPRIETARIO: "+nomeProprietario+"\n"+
               "MODELO: "+modelo+"\n"+
               "PLACA: "+placa+"\n"+
               "ANO: "+ano;
    }
}
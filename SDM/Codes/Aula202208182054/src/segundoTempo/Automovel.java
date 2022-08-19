package segundoTempo;

import primeiroTempo.*;

public class Automovel{
    private Proprietario proprietario;
    private String modelo;
    private String placa;
    private int ano;
    
    public Automovel(){ 
    }
    
    public Automovel(Proprietario proprietario, String modelo, String placa, int ano){
        this.proprietario = proprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    public Automovel(String nome, int idade, char sexo, String modelo, String placa, int ano){
        proprietario = new Proprietario(nome, idade, sexo);
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        
    }
    
    private void setProprietario(Proprietario nomeProprietario){
        this.proprietario = proprietario;
    }
    
    public Proprietario getProprietario(){
        return proprietario;
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
    public boolean alterarProprietario(Proprietario novoProprietario){
        this.setProprietario(novoProprietario);
        return true;
    }
    
    //imprimir dados do automovel
    public String imprimir(){
        return "NOME PROPRIETARIO: "+proprietario.getNome()+"\n"+
               "MODELO: "+modelo+"\n"+
               "PLACA: "+placa+"\n"+
               "ANO: "+ano;
    }
}
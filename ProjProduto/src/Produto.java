public class Produto {
    
   private String nome;
    private String descricao;
    private int quatidade;
    private double valorUnitario;

    
    
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    public String getNome(){
        return this.nome;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setQuantidade(int quantidade){
        this.quatidade=quantidade;
    }
    public int getQuantidade(){
        return this.quatidade;
    }
    public void setvalorUnitario(double valorUnitario){
        this.valorUnitario=valorUnitario;
    }
    public double getvalorUnitario(){
        return this.valorUnitario;
    }
    public double getvalorTotal(){
        return this.getvalorUnitario() * this.getQuantidade();
    }
    
}

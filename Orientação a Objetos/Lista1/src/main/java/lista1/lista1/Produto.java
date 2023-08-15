package lista1.lista1;
public class Produto {
    // Java é tipado, variaveis possuem tipos de dados
    //Tipos de dados primitivos (int, float, double, boolean)minusculos
    //Tipos de dados de classe (String, Float, Interger, Double)Maiusculos
    public int codigo;
    public String nome;
    public String descricao;
    public int quantidade;
    public float preco;
    
    //metodo construtor, tem o mesmo nome da classe
    public Produto (int codigo, String nome, String descricao, int quantidade, float preco){
        //this codigo representa o codigo do obj que chama o construtor 
        //codigo representa o valor informado pelo usuario
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this .quantidade = quantidade;
        this.preco = preco; 
  
    }
    //compra produtos
    public void comprar(int x){
        this.quantidade = this.quantidade + x;
    }
    public void vender(int x){
        if(x > this.quantidade){
            System.out.println(" Não ha estoque");}
        else{
        this.quantidade = this.quantidade - x;}
    }
        //exibe os dados do objeto q chama o metodo
    public void exibeDados(){
               System.out.println("Codigo: "+this.codigo+ "\nNome: "+this.nome+ "\nDescrição: "+this.descricao+"\nquantidade: "
                +this.quantidade+"\nPreço: "+ this.preco);
              
    }
    //aumentar o preco do produto
    public void aumentarPreco(float x){
        this.preco = this.preco + x; 
    }
    //diminuir preco do produto
    public void DiminuirPreco(float x){
        if (x > this.preco){
            System.out.println("O preco nao pode ser negativo");}
        else {
            this.preco = this.preco - x;
        } 
    }
}

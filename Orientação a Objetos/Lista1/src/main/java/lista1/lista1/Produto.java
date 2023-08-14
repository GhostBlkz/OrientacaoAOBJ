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
}

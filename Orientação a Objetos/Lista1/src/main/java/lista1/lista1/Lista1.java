package lista1.lista1;
public class Lista1 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto();
        obj1.codigo = 1;
        obj1.nome = "Sabonete";
        obj1.descricao = "Dove Creme";
        obj1.quantidade = 10;
        obj1.preco = 1.8f;
        
        Produto obj2 = new Produto();
        obj2.codigo = 2;
        obj2.nome = "Sabão";
        obj2.descricao = "Neutro";
        obj2.quantidade = 20;
        obj2.preco = 1.2f;
        
        //exibe dados do obj1
        obj1.exibeDados();
        //exibe dados do obj2
        obj2.exibeDados();
        
         obj1.comprar(5);
         obj2.comprar(8);
         obj1.vender(16);
        //exibe dados do obj1
        obj1.exibeDados();
        //exibe dados do obj2
        obj2.exibeDados(); 
                
    }
}

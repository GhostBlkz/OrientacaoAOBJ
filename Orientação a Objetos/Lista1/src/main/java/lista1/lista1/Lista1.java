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
        
        System.out.println("Codigo: "+obj1.codigo+ " Nome: "+obj1.nome+ " Descrição: "+obj1.descricao+" quantidade: "+obj1.quantidade+" Preço: "+
                obj1.preco);
        System.out.println("Codigo: "+obj2.codigo+ " Nome: "+obj2.nome+ " Descrição: "+obj2.descricao+" quantidade: "+obj2.quantidade+" Preço: "+
                obj2.preco);
        
        
                
    }
}

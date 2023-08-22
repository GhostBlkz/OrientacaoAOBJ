package lista1.exe3;
public class TestaProduto {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto(1, "sabonete", "Dove Creme", 10, 1.8f);
        
        Produto obj2 = new Produto(2, "sabão", "neutro", 20, 1.2f);
        
        //exibe dados do obj1
 
        
         obj1.comprar(5);
         obj2.comprar(8);
         obj1.vender(16);
        
        obj1.DiminuirPreco(3.0f);
        obj2.aumentarPreco(5.0f);
        
        obj1.exibeDados();
        obj2.exibeDados(); 
                
    }
}

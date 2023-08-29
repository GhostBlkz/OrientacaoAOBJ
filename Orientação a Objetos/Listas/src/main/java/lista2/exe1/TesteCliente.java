
package lista2.exe1;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        
        obj1.setNumeroConta("123456-7");
        obj1.setNumeroAgencia("1234-5");
        obj1.setNome("Claudio");
        obj1.setSaldo(200f);
        
        obj1.realizarDeposito(100f);
        obj1.realizarSaque(200f);
        
        Cliente obj2 = new Cliente();
        obj2.setNumeroConta("12345-67");
        obj2.setNumeroAgencia("12345");
        obj2.setNome("kajsdhjsakjsjdhhdjskaaksufhdjskjajshhgdhska");
        obj2.setSaldo(-100f);
       
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
    
}

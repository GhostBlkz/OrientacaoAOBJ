
package lista3.exe0;

public class TestaExe0 {
    public static void main(String[] args) {
        Endereço endereçoCliente1 = new Endereço();
        endereçoCliente1.setId(1); 
        endereçoCliente1.setNome("Rua Barbosa");
        endereçoCliente1.setBairro("Bairro da Pinga");
        endereçoCliente1.setCep("12345-678");
        endereçoCliente1.setCidade("Jabuti");
        endereçoCliente1.setPais("Jamolandia");
        endereçoCliente1.setNumero(123);
        
        
        Cliente cliente1 = new Cliente();
        cliente1.setCpf("22928765476");
        cliente1.setId(100);
        cliente1.setNome("Wagner");
        cliente1.setRg("797970707X");
        cliente1.setEndereço(endereçoCliente1);
        
        Fornecedor fornecedor1 = new Fornecedor(200, "Varejão do Tião",
                "Razão123454", "12345678901011",
                "456", "Rua Pandeiro", "Tartaruga",
                "56789-012", "Cidade do Fornecedor", "Jamolandia");
        
        
        
        
        
        
    }
    
    
            
}

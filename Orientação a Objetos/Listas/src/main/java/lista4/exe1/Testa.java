
package lista4.exe1;

public class Testa {
    public static void exibeResultado(Funcionario func){
        //func é um objeto da superclasse que tem comportamento polimorfico
        //funcpodeexecutar os metodos toString() e calculaSalario() das classes assistente gerente ou diretor
        //sendo assim func vai executar os metodos da classe passada na chamada do metodo
        System.out.println(func.toString());
        System.out.println(func.calculaSalario());
    }
    public static void main(String[] args) {
        Assistente objAssistente = new Assistente(2, "Fulano", "Franca", "123", 3000);
        exibeResultado(objAssistente);
        
        Gerente objGerente = new Gerente(1000, "Beltrano", "Franca", "456", 4000);
        exibeResultado(objGerente);
        
        Diretor objDiretor = new Diretor(20000, "Ciclano", "Franca", "789", 5000);
        exibeResultado(objDiretor);
        
    }
}

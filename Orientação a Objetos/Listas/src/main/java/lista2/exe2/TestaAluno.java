
package lista2.exe2;


public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.setNome("Josicleyson");
        obj1.setNumeroAluno(109048);
        obj1.setIdade(24);
        obj1.setP1(9.0f);
        obj1.setP2(10.0f);
        
        obj1.dadosAluno();
        obj1.notaFinal();
        
        Aluno obj2 = new Aluno(123456, "Malenia", 500, -1.0f, -1.0f);
        
    }
    
    
    
}

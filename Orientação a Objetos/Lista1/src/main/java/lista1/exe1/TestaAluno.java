package lista1.exe1;

public class TestaAluno {
    public static void main(String[] args){
        Aluno joao = new Aluno(1,"João",23,9.0f,7.0f);
        Aluno pedro = new Aluno(2,"Pedro",22,7.0f,4.0f);

        System.out.println(joao.dadosAluno());
        joao.passou();
        System.out.println(pedro.dadosAluno());
        pedro.passou();


    }
}

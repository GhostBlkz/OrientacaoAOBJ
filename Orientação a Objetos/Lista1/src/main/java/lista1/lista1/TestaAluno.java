package lista1.lista1;

public class TestaAluno {
    public static void main(String[] args){
        Aluno joao = new Aluno(1,"João",23,9.0f,7.0f);
        Aluno pedro = new Aluno(2,"Pedro",22,7.0f,4.0f);

        joao.dadosAluno();
        joao.notaFinal();
        joao.passou();
        pedro.dadosAluno();
        pedro.notaFinal();
        pedro.passou();


    }
}

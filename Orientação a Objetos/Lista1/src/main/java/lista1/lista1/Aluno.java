package lista1.lista1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno (int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void notaFinal(){
        System.out.println("A nota final é: "+(this.p1+this.p2)/2);
    }
    public void dadosAluno(){
        System.out.println("Numero do aluno: "+this.numeroAluno+"\nNome do aluno: "+this.nome+ "\nIdade do aluno: "+this.idade );
    }
    public void passou(){
        if((this.p1+this.p2)/2 > 6.0f){
            System.out.println("O aluno "+this.nome+" Passou");
        }
        else {
            System.out.println("O aluno "+this.nome+" Reprovou");
        }
    }

}

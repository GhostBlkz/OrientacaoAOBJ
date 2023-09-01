
package lista2.exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    public Aluno(){
    
    }
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
    
    }

    public final void setNumeroAluno(int numeroAluno) {
        String NumeroAlunoString = String.valueOf(numeroAluno);
        if(NumeroAlunoString.length() == 6){
        this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("Numero Invalido");
            this.numeroAluno = -1;
        }
    }

    public final void setNome(String nome) {
        if (nome.length() > 0 && nome.length() <= 30){
        this.nome = nome;
        }
        else{
            System.out.println("Nome Invalido");
            this.nome = "";
        }
    }

    public final void setIdade(int idade) {
        if(idade <= 0){
            System.out.println("Idade Negativa");
            
        }
        else{
        this.idade = idade;
            
        }
    }

    public final void setP1(float p1) {
        if(p1 >= 0 && p1 <=10){
        this.p1 = p1;
        }
        else{
            System.out.println("Nota negativa!!");
        }
            
    }

    public final void setP2(float p2) {
       if(p2 >= 0 && p2 <=10){
        this.p2 = p2;
        }
        else{
            System.out.println("Nota negativa!!");
        }
    }
    
    public void notaFinal(){
        System.out.println("Nota Final: "+(this.p1+this.p2)/2);
    }
    public void dadosAluno(){
        System.out.println("Nome: "+this.nome+"\nNumero: "+this.numeroAluno+"\nIdade: "+this.idade);
    }
    

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    
}


package lista2.exe0;

public class Aluno {
    private long ra;
    private int idade;
    private float p1;
    private float p2;
    

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
        else {
            System.out.println("Idade Inválida");
            this.idade = 0; // valor padrão
        }
    }

    public void setRa(long ra) {
        if (ra < 0){
            this.ra = ra;
        }
        else{
            System.out.println("RA invalido");
            this.ra = 0; // valor padrão
        }
    }

    public void setP1(float p1) {
        if(p1 > 0){
        this.p1 = p1;
        }
        else{
            System.out.println("Erro nota negativa!!!");
            this.p1 = 0; //valor padrao
        }
    }

    public void setP2(float p2) {
        if(p2 > 0){
        this.p2 = p2;
        }
        else{
            System.out.println("Erro nota negativa!!!");
            this.p2 = 0; //valor padrao
        }
    }

    public int getRa() {
        return ra;
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

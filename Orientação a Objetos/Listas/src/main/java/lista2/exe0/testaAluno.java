package lista2.exe0;

public class testaAluno {
    public static void main(String[] args) {
        Aluno fulano = new Aluno();
        
        fulano.setIdade(22);
        fulano.setRa(1090482211010l);
        fulano.setP1(5.9f);
        fulano.setP2(9.0f);
        
        Aluno ciclano = new Aluno();
        ciclano.setIdade(-1);
        ciclano.setRa(23343);
        ciclano.setP1(11f);
        ciclano.setP2(-1f);
        
        System.out.println(fulano.mostra());
        System.out.println("Usando Getter RA: "+fulano.getRa());
        System.out.println(ciclano.mostra());


        
    }
}

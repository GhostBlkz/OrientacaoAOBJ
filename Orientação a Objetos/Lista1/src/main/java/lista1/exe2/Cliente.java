package lista1.exe2;

public class Cliente {

    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public Cliente(){
        
    }

    public void realizaDeposito(float x){
        this.saldo = this.saldo+x;
    }
    public void realizaSaque(float x){
        if(x > this.saldo){
            System.out.println("Não há Saldo suficiente para Saque ");
        }
        else{
        this.saldo = this.saldo-x;
        }
    }
    public void mostrarDados(){
        System.out.println("Numero da conta: "+this.numeroConta+"\nNome: "+this.nome+"\nSaldo: "+this.saldo);
    }

}


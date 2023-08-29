package lista2.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo){
    
    }
    public Cliente(){
        
    }
    public void realizarDeposito(float saldo){
        this.setSaldo(this.saldo + saldo);
    }
    public void realizarSaque(float saldo){
        if(this.saldo <= 0){
            System.out.println("Não há saldo");
        }
        else{
            this.setSaldo(this.saldo - saldo);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "\nNumeroConta=" + this.numeroConta + ", \nNumeroAgencia=" + this.numeroAgencia + ", \nNome=" + this.nome + ", \nSaldo=" + this.saldo + '}';
    }
    
    
    public final void setNumeroConta(String numeroConta){
        if (numeroConta.length()==8&& numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;
        }
        else {
            this.numeroConta = "XXXXX"; //valor padrão
        }
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length()== 6 && numeroAgencia.charAt(4)== '-'){
        this.numeroAgencia = numeroAgencia;
        }
        else{
            this.numeroAgencia = "XXXXX"; // valor padrão
        }
    }

    public final void setNome(String nome) {
        if(nome.length() > 0 && nome.length() <= 30){
        this.nome = nome;
        }
        else{
            this.nome ="";
            System.out.println("O nome esta invalido");
        }
            
    }

    public final void setSaldo(float saldo) {
        if(saldo >= 0 ){
        this.saldo = saldo;
        }
        else{
            System.out.println("O saldo não pode ser negativo");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
    
}

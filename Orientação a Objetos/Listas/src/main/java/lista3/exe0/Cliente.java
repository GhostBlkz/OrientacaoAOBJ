package lista3.exe0;


public class Cliente {
    private int id;
    private String nome, rg,cpf;
    private Endereço endereço;

    public Cliente() {
    }

    public Cliente(int id, String nome, String rg, String cpf, Endereço endereço) {
        this.setId(id);
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setEndereço(endereço);
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public final void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", endere\u00e7o=" + endereço + '}';
    }
}

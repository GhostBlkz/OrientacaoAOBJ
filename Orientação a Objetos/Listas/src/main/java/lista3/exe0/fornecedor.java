package lista3.exe0;


public class fornecedor {
    private int id;
    private String nome, razaoSocial, cnpj;
    private Endereço endereço;

    public fornecedor() {
    }

    public fornecedor(int id, String nome, String razaoSocial, String cnpj, Endereço endereço) {
        this.setId(id);
        this.setNome(nome);
        this.setRazaoSocial (razaoSocial);
        this.setCnpj(cnpj);
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public final void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public final void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public final void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "fornecedor{" + "id=" + id + ", nome=" + nome + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", endere\u00e7o=" + endereço + '}';
    }
    
}

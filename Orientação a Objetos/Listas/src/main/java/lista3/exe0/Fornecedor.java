package lista3.exe0;


public class Fornecedor {
    private int id;
    private String nome, razaoSocial, cnpj;
    private Endereço endereço;

    public Fornecedor(int par, String varejão_do_Tião, String razão_Social_XYZ, String string, String string1, String rua_do_Fornecedor, String bairro_do_Fornecedor, String string2, String cidade_do_Fornecedor, String jamelandia) {
    }

    public Fornecedor(int id, String nome, String razaoSocial, String cnpj, String nomeEndereço, 
            String bairro, String cep, String cidade, String pais, int numero) {
        this.setId(id);
        this.setNome(nome);
        this.setRazaoSocial (razaoSocial);
        this.setCnpj(cnpj);
        this.setEndereço(new Endereço(id, nomeEndereço, bairro, cep, cidade, pais, numero ));
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
        return "Fornecedor{" + "id=" + id + ", nome=" + nome + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", endere\u00e7o=" + endereço + '}';
    }
    

    
}

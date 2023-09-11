package lista3.exe0;


public class Endereço {
    private int id, numero;
    private String nome, bairro, cep, cidade, pais;

    public Endereço() {
    }

    public Endereço(int id, String nome, String bairro, String cep, String cidade, String pais) {
        this.setId(id);
        this.setNome(nome);
        this.setBairro(bairro);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setPais(pais);
        this.setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        this.numero = numero;
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

    public String getBairro() {
        return bairro;
    }

    public final void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public final void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public final void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public final void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endere\u00e7o{" + "id=" + id + 
                ", numero=" + numero + 
                ", nome=" + nome + 
                ", bairro=" + bairro + 
                ", cep=" + cep + 
                ", cidade=" + cidade + 
                ", pais=" + pais + '}';
    }
    

    
    
}

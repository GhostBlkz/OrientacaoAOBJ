package br.edu.fatecfranca.produtodb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // entidade de banco de dados
@Table(name = "Produto") // é uma tabela produto
public class Produto {
	@Id // chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "Preco")
	private float preco;
	
	@Column(name = "Qtde")
	private int qtde;

	public Produto() {
	}

	public Produto(Long id, String nome, String descricao, float preco, int qtde) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.qtde = qtde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", qtde="
				+ qtde + "]";
	}

}

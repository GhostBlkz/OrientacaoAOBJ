package br.edu.fatecfranca.produtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.produtodb.model.entity.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//aqui não fazemos nada
	//essa interfaçe vai herdar os metodos de CRUD
	//Ja associados a classe Produto que criamos

}

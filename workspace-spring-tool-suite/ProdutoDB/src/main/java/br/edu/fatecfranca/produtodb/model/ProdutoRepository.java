package br.edu.fatecfranca.produtodb.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//aqui não fazemos nada
	//essa interfaçe vai herdar os metodos de CRUD
	//Ja associados a classe Produto que criamos

}

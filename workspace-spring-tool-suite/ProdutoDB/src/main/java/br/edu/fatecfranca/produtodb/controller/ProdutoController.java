package br.edu.fatecfranca.produtodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import br.edu.fatecfranca.produtodb.model.dto.ProdutoDto;
import br.edu.fatecfranca.produtodb.service.ProdutoService;

@RestController //Classe vai responder pelas requisições rest
@RequestMapping("/produto") // o endpoint
public class ProdutoController {
	//vamos criar um objeto que vai conter todos os metodos
	//de crud da classe produto
	// a criação deste objeto nao vai exigir o new, oque caracteriza
	//o conceito de injeção de dependência
	@Autowired
	ProdutoService servico;
	
	//consulta no banco de dados e sempre o verbo GET
	@GetMapping 
	public List<ProdutoDto> getProduto(){
		return servico.getProduto();
	}
	
	//consulta no banco de dados por um produto especifico
	@GetMapping("/{id}")
		public ProdutoDto getProduto(@PathVariable Long id) {
		ProdutoDto prod = servico.getProduto(id);
		return prod;
	}
	
	//insere no banco sempre que usa o verbo POST
	//recupera o corpo da requisição e insere no banco
	@PostMapping
	public ProdutoDto addProduto(@RequestBody ProdutoDto produtoDto) {
		return servico.addProduto(produtoDto);
	}
	
	//remove do banco de dados
	@DeleteMapping("/{id}")
	public String removeProduto(@PathVariable Long id) {
		return servico.removeProduto(id);
	}
	
	//atualiza o banco de dados
	@PutMapping()
	public ProdutoDto updateProduto(@RequestBody ProdutoDto produtoDto) {
		//perceba que o save está sendo ultilizado na inserção 
		//e atualização. isso porque, caso o produto não tenha id
		//é para salvar, caso o produto tenha id
		//vai atualizar
		return servico.updateProduto(produtoDto);
		
	}
	

}

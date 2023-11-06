package br.edu.fatecfranca.produtodb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.fatecfranca.produtodb.model.dto.ProdutoDto;
import br.edu.fatecfranca.produtodb.model.entity.Produto;
import br.edu.fatecfranca.produtodb.repository.ProdutoRepository;

@Service
public class ProdutoService {
	//vamos criar um objeto que vai conter todos os metodos
		//de crud da classe produto
		// a criação deste objeto nao vai exigir o new, oque caracteriza
		//o conceito de injeção de dependência
		@Autowired
		ProdutoRepository injecao;
		
		//consulta no banco de dados e sempre o verbo GET
		@GetMapping 
		public List<ProdutoDto> getProduto(){
			List<Produto> produtos = injecao.findAll();
			return converteListaProdutosToListaDtos(produtos);
		}
		
		//consulta no banco de dados por um produto especifico
		@GetMapping("/{id}")
			public ProdutoDto getProduto(@PathVariable Long id) {
			Optional<Produto> optional = injecao.findById(id);
			if (optional.isPresent()) {
				//obtem produto encontrado e converte em dto
				return converteProdutoToDto(optional.get());
			}
			
			return null; //não encontrou o produto
		}
		
		//insere no banco sempre que usa o verbo POST
		//recupera o corpo da requisição e insere no banco
		@PostMapping
		public ProdutoDto addProduto(@RequestBody ProdutoDto produtoDto) {
			//converte para produto pois enviaremos para o banco de dados
			Produto produto = converteDtoToProduto(produtoDto);
			//converte para dto pois enviaremos para o frontend
			return converteProdutoToDto(injecao.save(produto));
		}
		
		//remove do banco de dados
		@DeleteMapping("/{id}")
		public String removeProduto(@PathVariable Long id) {
			if (injecao.existsById(id)) { //caso o produto exista
			injecao.deleteById(id);
			return "Remoção com sucesso";
			}
			//nao existe
			return "Produto nao existe";
		}
		
		//atualiza o banco de dados
		@PutMapping()
		public ProdutoDto updateProduto(@RequestBody ProdutoDto produtoDto) {
			//perceba que o save está sendo ultilizado na inserção 
			//e atualização. isso porque, caso o produto não tenha id
			//é para salvar, caso o produto tenha id
			//vai atualizar
			Produto produto = converteDtoToProduto(produtoDto);
			
			return converteProdutoToDto(injecao.save(produto));
			
			
		}
		//converte ProdutiDto em Produto
		public Produto converteDtoToProduto (ProdutoDto dto) {
			Produto produto = new Produto();
			
			produto.setDescricao(dto.getDescricao());
			produto.setId(dto.getId());
			produto.setPreco(dto.getPreco());
			produto.setQtde(dto.getQtde());
			
			return produto;
		}
		//converte Produto em ProdutoDto
		public ProdutoDto converteProdutoToDto(Produto produto) {
			ProdutoDto dto = new ProdutoDto();
			dto.setDescricao(produto.getDescricao());
			dto.setId(produto.getId());
			dto.setPreco(produto.getPreco());
			dto.setQtde(produto.getQtde());
			
			return dto;
		}
		//converte uma lista de produtos em uma lista em dtos
		public List<ProdutoDto>
			converteListaProdutosToListaDtos(List<Produto> produtos){
			//cria uma lista de dtos
			List <ProdutoDto> listaDto =new ArrayList<ProdutoDto>();
			
			//para cada produto da lista
			for(int i=0; i<produtos.size();i++) {
				//converte produto em dto e coloca na lista de dto
				listaDto.add(converteProdutoToDto(produtos.get(i)));
			}
			//retorna a lista de dto
			return listaDto;
		}
}

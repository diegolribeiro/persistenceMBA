package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fiap.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	 @Query("select p from Produto p where p.nome = :nome")
	 public List<Produto> findByName(@Param("nome") String nome);
	 
}

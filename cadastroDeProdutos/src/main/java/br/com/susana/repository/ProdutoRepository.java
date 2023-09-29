package br.com.susana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.susana.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

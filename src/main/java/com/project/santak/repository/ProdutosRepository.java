package com.project.santak.repository;

import com.project.santak.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProdutosRepository extends CrudRepository<Produto, Integer> {

}

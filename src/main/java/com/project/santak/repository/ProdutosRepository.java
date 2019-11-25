package com.project.santak.repository;

import com.project.santak.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long> {
   Produto findById(long id);

   @Query("select p from Produto p where p.cor like %?1%")
   List<Produto> findProdutoByCor(String cor);
}

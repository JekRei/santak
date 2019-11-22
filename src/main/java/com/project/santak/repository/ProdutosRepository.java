package com.project.santak.repository;

import com.project.santak.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ProdutosRepository extends CrudRepository<Produto, String> {
   Produto findById(long id);

   @Query("from Produto where cor like :search")
   Iterable<Produto> findByName(@Param("search")String search);
}

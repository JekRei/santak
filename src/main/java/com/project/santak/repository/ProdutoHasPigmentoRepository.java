package com.project.santak.repository;

import com.project.santak.model.ProdutoHasPigmento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoHasPigmentoRepository extends CrudRepository<ProdutoHasPigmento, Integer> {
}

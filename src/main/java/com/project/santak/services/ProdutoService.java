package com.project.santak.services;

import com.project.santak.model.Produto;
import com.project.santak.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProdutoService{

    @Autowired
    private ProdutosRepository pr;

    public List<Produto> listAll(){
        return pr.findAll();
    }

    public Produto get(Long id){
        return pr.findById(id).get();
    }

    public void save(Produto produto) {
        pr.save(produto);
    }

    public void delete(Long id){
        pr.deleteById(id);
    }
}

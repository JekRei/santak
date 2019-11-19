package com.project.santak.repository;

import com.project.santak.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, String> {
    Usuario findByLogin(String login);
}

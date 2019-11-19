package com.project.santak.security;


import com.project.santak.model.Usuario;
import com.project.santak.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user = ur.findByLogin(email);

        if(user == null)
            throw new  UsernameNotFoundException("Usuário não encontrado!");

        return new Usuario(user.getUsername(), user.getPassword(), true, true, true, true, user.getAuthorities());
    }
}

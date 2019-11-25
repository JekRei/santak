package com.project.santak.services;

import com.project.santak.model.Role;
import com.project.santak.model.Usuario;
import com.project.santak.repository.RoleRepository;
import com.project.santak.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UserService{

    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    RoleRepository rr;

    @Autowired
    UsuarioRepository ur;

    public void saveUser(Usuario usuario) {
        usuario.setSenha(encoder.encode(usuario.getPassword()));
        Role userRole = rr.findByRole("ROLE_USER");
        usuario.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        ur.save(usuario);
    }

    public void updateUser(Usuario usuario){
        usuario.getRoles();
        ur.save(usuario);
    }

    public List<Usuario> listAll(){
        return ur.findAll();
    }

    public Usuario get(Long id){
        return ur.findById(id).get();
    }

    public void delete(Long id){
        ur.deleteById(id);
    }
}

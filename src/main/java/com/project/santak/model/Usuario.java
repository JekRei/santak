package com.project.santak.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//@Data
//@EqualsAndHashCode(exclude = "produtos")

@Entity
public class Usuario implements UserDetails, Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nome;
    private String senha;
    private String login;
    private String fone;

    @ManyToMany
    @JoinTable(name = "usuarios_roles",
            joinColumns = @JoinColumn(
                    name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;


    //id


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //email
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //fone
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.getRoles();
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

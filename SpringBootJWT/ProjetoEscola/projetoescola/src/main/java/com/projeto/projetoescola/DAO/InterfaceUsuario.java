package com.projeto.projetoescola.DAO;

import org.springframework.data.repository.CrudRepository;

import com.projeto.projetoescola.model.Usuario;


public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {
}
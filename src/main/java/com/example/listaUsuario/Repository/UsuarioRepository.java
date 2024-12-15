package com.example.listaUsuario.Repository;

import com.example.listaUsuario.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

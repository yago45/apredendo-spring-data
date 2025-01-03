package com.yago.aprendo.spring.data.infrastructure.repository;

import com.yago.aprendo.spring.data.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    boolean sxistsByEmail(String email);
}

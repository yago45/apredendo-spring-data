package com.yago.aprendo.spring.data.infrastructure.repository;

import com.yago.aprendo.spring.data.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

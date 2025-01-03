package com.yago.aprendo.spring.data.infrastructure.repository;

import com.yago.aprendo.spring.data.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}

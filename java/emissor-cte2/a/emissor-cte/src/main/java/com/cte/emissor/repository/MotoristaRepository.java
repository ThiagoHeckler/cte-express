package com.cte.emissor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cte.emissor.entity.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long>{

}
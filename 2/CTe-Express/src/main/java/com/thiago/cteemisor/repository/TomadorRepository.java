package com.thiago.cteemisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cteemisor.entity.Tomador;


@Repository
public interface TomadorRepository extends JpaRepository<Tomador, Long>{



}
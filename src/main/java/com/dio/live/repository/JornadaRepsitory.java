package com.dio.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.live.model.JornadaTrabalho;

@Repository
public interface JornadaRepsitory extends JpaRepository<JornadaTrabalho, Long>{
}

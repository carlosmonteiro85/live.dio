package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepsitory;


@Service
public class JornadaService {
	
	JornadaRepsitory jornadaRepository;
	

	public JornadaService(JornadaRepsitory jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho save(JornadaTrabalho jornada) {
		return jornadaRepository.save(jornada);
	}
	
	public JornadaTrabalho update(JornadaTrabalho jornada) {
		return jornadaRepository.save(jornada);
	}

	public Optional<JornadaTrabalho> findById(Long id) {
		return jornadaRepository.findById(id);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public void delete(Long id) {
		jornadaRepository.deleteById(id);
	}

}

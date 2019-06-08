package com.departamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departamento.domain.Departamento;
import com.departamento.repository.DepartamentoRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	DepartamentoRepository departamentoRepository;

	@GetMapping("/")
	public List<Departamento> getDepartamentos() {
		log.info("Lista de departamentos");
		return departamentoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Departamento getDepartamentoPorId(@PathVariable("id") Long id) {
		log.info("Obtener un departamento por id");
		return departamentoRepository.getDepartamentoPorId(id);
	}

	@GetMapping("/organizacion/{organizacionId}")
	public List<Departamento> departamentosPorOrganizacion(@PathVariable("organizacionId") Long organizacionId) {
		log.info("Departamentos para la organizacion: {}", organizacionId);
		return departamentoRepository.getDepartamentosPorOganizacion(organizacionId);
	}

	@GetMapping("/organizacion/{organizacionId}/con-empleados")
	public List<Departamento> getOrganizacionesConEmpleados(@PathVariable("organizacionId") Long organizacionId) {
//		log.info("Departamento ");
		List<Departamento> departamentos = departamentoRepository.getDepartamentosPorOganizacion(organizacionId);
		log.info("departamentos {}", departamentos);
		return departamentos;
	}

	@PostMapping("/")
	public Departamento agregarDepartamentos(@RequestBody Departamento departamento) {
		log.info("Departamento agregado: {}", departamento);
		return departamentoRepository.add(departamento);
	}

}

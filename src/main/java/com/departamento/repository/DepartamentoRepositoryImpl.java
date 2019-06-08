package com.departamento.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.departamento.domain.Departamento;

public class DepartamentoRepositoryImpl implements DepartamentoRepository {

	private List<Departamento> departamentos = new ArrayList<>();

	@Override
	public Departamento add(Departamento departamento) {
		departamento.setId((long) departamentos.size() + 1);
		departamentos.add(departamento);
		return departamento;
	}

	@Override
	public List<Departamento> findAll() {
		return departamentos;
	}

	@Override
	public Departamento getDepartamentoPorId(Long departamentoId) {
		Optional<Departamento> departamento = departamentos.stream().filter(d -> d.getId().equals(departamentoId))
				.findAny();
		if (departamento.isPresent())
			return departamento.get();

		return null;
	}

	@Override
	public List<Departamento> getDepartamentosPorOganizacion(Long organizacionId) {
		return departamentos.stream().filter(d -> d.getOrganizacionId().equals(organizacionId))
				.collect(Collectors.toList());
	}

}

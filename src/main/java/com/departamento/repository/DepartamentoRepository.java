package com.departamento.repository;

import java.util.List;

import com.departamento.domain.Departamento;

public interface DepartamentoRepository {

	public Departamento add(Departamento departamento);

	public List<Departamento> findAll();

	public Departamento getDepartamentoPorId(Long departamentoId);

	public List<Departamento> getDepartamentosPorOganizacion(Long organizacionId);

}

package com.departamento.client;

import java.util.List;

import com.departamento.domain.Empleado;

public interface ObtenerEmpleadosPorDepartamento {

	public List<Empleado> getEmpleadosPorDepartamento(Long departamentoId);
}

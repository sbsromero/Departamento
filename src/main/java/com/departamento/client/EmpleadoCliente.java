package com.departamento.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.departamento.domain.Empleado;

@FeignClient(value = "servicio-empleado")
public interface EmpleadoCliente {

	@GetMapping("/empleados/departamento/{departamentoId}")
	List<Empleado> buscarPorDepartamento(@PathVariable("departamentoId") Long departamentoId);

}

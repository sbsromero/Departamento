package com.departamento.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.departamento.domain.Empleado;

@Service
public class ObtenerEmpleadosPorDepartamentoImpl implements ObtenerEmpleadosPorDepartamento {

	private RestTemplate restTemplate;
	private String empleadosHost;

	@Autowired
	public ObtenerEmpleadosPorDepartamentoImpl(RestTemplate restTemplate,
			@Value("${empleadosHost}") String empleadosHost) {
		this.restTemplate = restTemplate;
		this.empleadosHost = empleadosHost;
	}

	@Override
	public List<Empleado> getEmpleadosPorDepartamento(Long departamentoId) {
		ResponseEntity<List<Empleado>> responseEntity = restTemplate.exchange(
				empleadosHost + "/departamento/" + departamentoId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Empleado>>() {
				});
		return responseEntity.getBody();
	}

}

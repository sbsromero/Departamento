package com.departamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.departamento.domain.Departamento;
import com.departamento.repository.DepartamentoRepository;
import com.departamento.repository.DepartamentoRepositoryImpl;

@SpringBootApplication
@EnableEurekaClient
public class DepartamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartamentoApplication.class, args);
	}

	@Bean
	DepartamentoRepository departamentoRepository() {
		DepartamentoRepository departamentoRepository = new DepartamentoRepositoryImpl();
		departamentoRepository.add(new Departamento(1L, "Development"));
		departamentoRepository.add(new Departamento(1L, "Operations"));
		departamentoRepository.add(new Departamento(2L, "Development"));
		departamentoRepository.add(new Departamento(2L, "Operations"));
		return departamentoRepository;
	}
}

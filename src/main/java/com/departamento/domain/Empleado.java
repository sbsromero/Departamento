package com.departamento.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Empleado {

	private Long id;
	private String nombreEmpleado;
	private int edad;
	private String cargo;

	public Empleado(String nombreEmpleado, int edad, String cargo) {
		this.nombreEmpleado = nombreEmpleado;
		this.edad = edad;
		this.cargo = cargo;
	}
}

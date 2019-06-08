package com.departamento.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Departamento {

	private Long id;
	private Long organizacionId;
	private String nombre;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public Departamento(long organizacionId, String nombre) {
		super();
		this.organizacionId = organizacionId;
		this.nombre = nombre;
	}


}

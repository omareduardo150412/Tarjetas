package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.ibm.academia.apirest.enums.TipoTarjeta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Perfil  implements Serializable
{

	private String pasion;
	private Double salario;
	private Integer edad;
	private List<TipoTarjeta> tarjetas;
	private static final long serialVersionUID = -6778267421386051581L;
	
}


package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Pasion;

public interface PasionDAO extends GenericoDAO<Pasion>
{
	public Optional<Pasion>findByNombre(String nombre);
}

package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Pasion;
import com.ibm.academia.apirest.repositories.PasionRepository;
@Service
public class PasionDAOImpl extends GenericoDAOImpl<Pasion,PasionRepository> implements PasionDAO {

	@Autowired
	public PasionDAOImpl(PasionRepository repository) 
	{
		super(repository);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Pasion> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

}

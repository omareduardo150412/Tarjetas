package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Edad;
import com.ibm.academia.apirest.repositories.EdadRepository;
@Service
public class EdadDAOImpl extends GenericoDAOImpl<Edad,EdadRepository> implements EdadDAO
{
    @Autowired
	public EdadDAOImpl(EdadRepository repository)
	{
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Edad> findByIdLessThanEqual(Integer id) {
		return repository.findByIdLessThanEqual(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Edad> findByIdBetween(Integer menor, Integer mayor) {
		return repository.findByIdBetween(menor, mayor);
	}
	
	@Override
	@Transactional(readOnly = true)
	 public Iterable<Edad> findBySalarioId(Integer salarioId)
	 {	 
		return repository.findBySalarioId(salarioId);
	 }
      
}

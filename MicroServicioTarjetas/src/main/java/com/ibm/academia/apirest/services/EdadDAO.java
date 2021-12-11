package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Edad;

public interface EdadDAO extends GenericoDAO<Edad>
{
	public Iterable<Edad> findByIdLessThanEqual(Integer id);
    public Iterable<Edad> findByIdBetween(Integer menor,Integer mayor);
    public Iterable<Edad> findBySalarioId(Integer salarioId);
    
}

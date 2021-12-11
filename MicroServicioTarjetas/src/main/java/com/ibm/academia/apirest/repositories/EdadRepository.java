package com.ibm.academia.apirest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Edad;

@Repository
public interface EdadRepository extends CrudRepository<Edad,Integer>
{
    public Iterable<Edad> findByIdLessThanEqual(Integer id);
    public Iterable<Edad> findByIdBetween(Integer menor,Integer mayor);
    public Iterable<Edad> findBySalarioId(Integer salarioId);
    
}

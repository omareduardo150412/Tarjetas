package com.ibm.academia.apirest.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Pasion;
import com.ibm.academia.apirest.entities.Salario;
@Repository
public interface SalarioRepository extends CrudRepository<Salario,Integer> 
{
	public Iterable<Salario> findByPasionId(Integer pasion);
}

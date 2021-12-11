package com.ibm.academia.apirest.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.entities.Edad;
import com.ibm.academia.apirest.entities.Pasion;
import com.ibm.academia.apirest.entities.Perfil;
import com.ibm.academia.apirest.entities.Salario;
import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.enums.TipoTarjeta;
import com.ibm.academia.apirest.services.EdadDAO;
import com.ibm.academia.apirest.services.PasionDAO;
import com.ibm.academia.apirest.services.SalarioDAO;
import com.ibm.academia.apirest.services.TarjetaDAO;


@RestController
public class PerfilController 
{
	@Autowired
	PasionDAO pasionDao;
	
	@Autowired
	SalarioDAO salarioDao;
	
	@Autowired
	EdadDAO edadDao;
	
	@Autowired
	TarjetaDAO tarjetaDao;
	
	@RequestMapping(value="/perfil",params={"pasion","salario","edad"})
    public ResponseEntity<?> buscarPerfiles(@RequestParam String pasion, @RequestParam Double salario,@RequestParam Integer edad)
	{
		List<TipoTarjeta>tarjetas = new ArrayList<TipoTarjeta>();
		List<Tarjeta> tarjetasCompletas=null;
		Double maximo=0.00;
		Double minimo=0.00;
        Optional<Pasion> oPasion=pasionDao.findByNombre(pasion);
        Salario salarioAuxiliar=null;
        Edad edadAuxiliar=null;
        Boolean bandera1= false;
        Boolean bandera2= false;
        int i=0,j=0;
        if(oPasion.isPresent())
        {
        	List<Salario> salarios=(List<Salario>) salarioDao.findByPasionId(oPasion.get().getId());
        	while(i< salarios.size())
        	{
        		minimo=salarios.get(i).getSalarioMinimo();
        		maximo=salarios.get(i).getSalarioMaximo();
        		
        		if(maximo>0.00)
        		{
        			if((salario>=minimo)&&(salario<=maximo)&&(bandera1==false))
        			{
        				salarioAuxiliar=salarios.get(i);
        				i=salarios.size();
        				bandera1=true;
        			}
        		}
        		
        		if(maximo == 00)
        		{
        			if((salario>=minimo)&&(bandera2==false))
        			{
        				salarioAuxiliar=salarios.get(i);
        				i=salarios.size();
        				bandera2=true;
        			}
        		}
        		
        		
        		i++;
        	}
        	
        	
        	if(salarioAuxiliar !=  null)
        	{
        		System.out.println(salarioAuxiliar);
        		List<Edad> edades=(List<Edad>)edadDao.findBySalarioId(salarioAuxiliar.getId()) ;
			    while(j<edades.size())
			    {
			    	if(((edad>=edades.get(j).getEdadMinima())&&(edad<=edades.get(j).getEdadMaxima()))&&(bandera2==false))
			    	{
			    		edadAuxiliar=edades.get(j);
			    		bandera2=true;
			    		j=edades.size();
			    		
			    	}
			    	j++;
			    }
        		
        	}
        	
        	if(edadAuxiliar!=null) {
        		System.out.println(edadAuxiliar);
        		tarjetasCompletas=(List<Tarjeta>) tarjetaDao.findByEdadesId(edadAuxiliar.getId());
        		for(int m=0;m<tarjetasCompletas.size();m++)
        		{
        			tarjetas.add(tarjetasCompletas.get(m).getTipoTarjeta());
        		}
        		
        	}
        }
        
       
        Perfil usuario= new Perfil(pasion, salario, edad,tarjetas);
        return new ResponseEntity<Perfil>(usuario, HttpStatus.OK);
    } 
}


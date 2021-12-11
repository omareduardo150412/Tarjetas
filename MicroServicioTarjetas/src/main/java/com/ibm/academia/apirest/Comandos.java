package com.ibm.academia.apirest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Edad;
import com.ibm.academia.apirest.entities.Pasion;
import com.ibm.academia.apirest.entities.Salario;
import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.enums.TipoTarjeta;
import com.ibm.academia.apirest.services.EdadDAO;
import com.ibm.academia.apirest.services.PasionDAO;
import com.ibm.academia.apirest.services.SalarioDAO;
import com.ibm.academia.apirest.services.TarjetaDAO;


@Component
public class Comandos implements CommandLineRunner 
{
		@Autowired
		private TarjetaDAO tarjetaDao;
		
		@Autowired
		private PasionDAO pasionDao;
		
		@Autowired
		private SalarioDAO salarioDao;
		
		@Autowired
		private EdadDAO edadDao;
		
		public void run(String... args) throws Exception 
		{
		
	    Tarjeta tarjetaAfinity= new Tarjeta(null,TipoTarjeta.AFINITY_CARD);	
		Tarjeta tarjetaAmerica= new Tarjeta(null,TipoTarjeta.AMÉRICA_DEPORTEÍSMO);
		Tarjeta tarjetaApac= new Tarjeta(null,TipoTarjeta.APAC);
		Tarjeta tarjetaTeleton= new Tarjeta(null,TipoTarjeta.BANAMEX_TELETÓN);
		Tarjeta tarjetaBest= new Tarjeta(null,TipoTarjeta.BEST_BUY_BANAMEX);
		Tarjeta tarjetaBsmart= new Tarjeta(null,TipoTarjeta.BPLUSSMART);
		Tarjeta tarjetaCiti= new Tarjeta(null,TipoTarjeta.CITI_ADDVANTAGE);
		Tarjeta tarjetaClasica= new Tarjeta(null,TipoTarjeta.CLASICA);
		Tarjeta tarjetaCostco= new Tarjeta(null,TipoTarjeta.COSTCO);
		Tarjeta tarjetaVerde= new Tarjeta(null,TipoTarjeta.LA_VERDE_DEPORTEÍSMO);
		Tarjeta tarjetaMarti= new Tarjeta(null,TipoTarjeta.MARTÍ_CLASICA_CITIBANAMEX);
		Tarjeta tarjetaOffice= new Tarjeta(null,TipoTarjeta.OFFICE_DEPOT);
		Tarjeta tarjetaOro= new Tarjeta(null,TipoTarjeta.ORO);
		Tarjeta tarjetaPlatinum= new Tarjeta(null,TipoTarjeta.PLATINUM);
		Tarjeta tarjetaPumas= new Tarjeta(null,TipoTarjeta.PUMAS_DEPORTEÍSMO);
		Tarjeta tarjetaHome= new Tarjeta(null,TipoTarjeta.THE_HOME_DEPOT);
		Tarjeta tarjetaToluca= new Tarjeta(null,TipoTarjeta.TOLUCA_DEPORTEÍSMO);
		Tarjeta tarjetaMartinPremiun= new Tarjeta(null,TipoTarjeta.MARTÍ_PREMIUN_CITIBANAMEX);
		
		
		tarjetaDao.guardar(tarjetaBsmart);
		tarjetaDao.guardar(tarjetaCostco);
		tarjetaDao.guardar(tarjetaAfinity);
		tarjetaDao.guardar(tarjetaAmerica);
		tarjetaDao.guardar(tarjetaApac);
		tarjetaDao.guardar(tarjetaBest);
		tarjetaDao.guardar(tarjetaCiti);
		tarjetaDao.guardar(tarjetaClasica);
		tarjetaDao.guardar(tarjetaHome);
		tarjetaDao.guardar(tarjetaMarti);
		tarjetaDao.guardar(tarjetaOffice);
		tarjetaDao.guardar(tarjetaOro);
		tarjetaDao.guardar(tarjetaPlatinum);
		tarjetaDao.guardar(tarjetaPumas);
		tarjetaDao.guardar(tarjetaTeleton);
		tarjetaDao.guardar(tarjetaToluca);
		tarjetaDao.guardar(tarjetaVerde);
		tarjetaDao.guardar(tarjetaMartinPremiun);
		
		
		
		Pasion shoping= new Pasion(null, "Shopping");
		Pasion travels= new Pasion(null, "Travels");
		Pasion help= new Pasion(null, "Help");
		Pasion business= new Pasion(null, "My business");
		Pasion sport= new Pasion(null, "Sports");
		Pasion style= new Pasion(null, "My style");
		pasionDao.guardar(shoping);
		pasionDao.guardar(travels);
		pasionDao.guardar(help);
		pasionDao.guardar(business);
		pasionDao.guardar(sport);
		pasionDao.guardar(style);
		
		Salario salario01= new Salario(null, "rango", 7000.00);
		salario01.setSalarioMaximo(14999.00);
		Salario salario02= new Salario(null, "rango", 15000.00);
		salario02.setSalarioMaximo(34999.00);
		Salario salario03= new Salario(null, "rango", 35000.00);
		salario03.setSalarioMaximo(49999.00);
		Salario salario04= new Salario(null, "maximo", 5000.00);
		Salario salario05= new Salario(null, "rango", 12000.00);
		salario05.setSalarioMaximo(29999.00);
		Salario salario06= new Salario(null, "rango", 30000.00);
		salario06.setSalarioMaximo(34999.00);
		Salario salario07= new Salario(null, "rango", 35000.00);
		salario07.setSalarioMaximo(49999.00);
		Salario salario08= new Salario(null, "maximo", 50000.00);
		Salario salario09= new Salario(null, "maximo", 12000.00);
		Salario salario10= new Salario(null, "maximo", 7000.00);
		Salario salario11= new Salario(null, "rango", 7000.00);
		salario11.setSalarioMaximo(34999.00);
		Salario salario12= new Salario(null, "maximo", 35000.00);
		Salario salario13= new Salario(null, "rango", 7000.00);
		salario13.setSalarioMaximo(14999.00);
		Salario salario14= new Salario(null, "rango", 15000.00);
		salario14.setSalarioMaximo(29999.00);
		Salario salario15= new Salario(null, "rango", 30000.00);
		salario15.setSalarioMaximo(34999.00);
		Salario salario16= new Salario(null, "maximo", 35000.00);
		
		
		salarioDao.guardar(salario16);
		salarioDao.guardar(salario15);
		salarioDao.guardar(salario14);
		salarioDao.guardar(salario13);
		salarioDao.guardar(salario12);
		salarioDao.guardar(salario11);
		salarioDao.guardar(salario10);
		salarioDao.guardar(salario09);
		salarioDao.guardar(salario08);
		salarioDao.guardar(salario07);
		salarioDao.guardar(salario06);
		salarioDao.guardar(salario05);
		salarioDao.guardar(salario04);
		salarioDao.guardar(salario03);
		salarioDao.guardar(salario02);
		salarioDao.guardar(salario01);
		
		Edad edad01= new Edad(null, 18, 23);
		Edad edad02= new Edad(null, 24, 32);
		Edad edad03= new Edad(null, 33, 75);
		Edad edad04= new Edad(null, 18, 23);
		Edad edad05= new Edad(null, 24, 32);
		Edad edad07= new Edad(null, 33, 75);
		Edad edad08= new Edad(null, 18, 23);
		Edad edad09= new Edad(null, 24, 75);
		Edad edad10= new Edad(null, 18, 23);
		Edad edad11= new Edad(null, 24, 75);
		Edad edad12= new Edad(null,18,75);
		Edad edad13= new Edad(null,18,23);
		Edad edad14= new Edad(null,24,75);
		Edad edad15= new Edad(null,18,23);
		Edad edad16= new Edad(null,24,75);
		Edad edad17= new Edad(null,18,22);
		Edad edad18= new Edad(null,23,75);
		Edad edad19= new Edad(null,18,75);
		Edad edad20= new Edad(null,18,75);
		Edad edad21= new Edad(null,18,75);
		Edad edad22= new Edad(null,18,75);
		Edad edad23= new Edad(null,18,32);
		Edad edad24= new Edad(null,33,75);
		Edad edad25= new Edad(null, 18, 23);
		Edad edad26= new Edad(null, 24, 32);
		Edad edad27= new Edad(null, 33, 75);
		Edad edad28= new Edad(null, 18, 23);
		Edad edad29= new Edad(null, 24, 32);
		Edad edad30= new Edad(null, 33, 75);
		Edad edad31= new Edad(null, 18, 23);
		Edad edad32= new Edad(null,24,75);
		
		edadDao.guardar(edad01);
		edadDao.guardar(edad02);
		edadDao.guardar(edad03);
		edadDao.guardar(edad04);
		edadDao.guardar(edad05);
		edadDao.guardar(edad07);
		edadDao.guardar(edad08);
		edadDao.guardar(edad09);
		edadDao.guardar(edad10);
		edadDao.guardar(edad11);
		edadDao.guardar(edad12);
		edadDao.guardar(edad13);
		edadDao.guardar(edad14);
		edadDao.guardar(edad15);
		edadDao.guardar(edad16);
		edadDao.guardar(edad17);
		edadDao.guardar(edad18);
		edadDao.guardar(edad19);
		edadDao.guardar(edad20);
		edadDao.guardar(edad21);
		edadDao.guardar(edad22);
		edadDao.guardar(edad23);
		edadDao.guardar(edad24);
		edadDao.guardar(edad25);
		edadDao.guardar(edad26);
		edadDao.guardar(edad27);
		edadDao.guardar(edad28);
		edadDao.guardar(edad29);
		edadDao.guardar(edad30);
		edadDao.guardar(edad31);
		edadDao.guardar(edad32);
		
		Pasion pasion01= pasionDao.buscarPorId(1).get();
		Salario salarioAuxiliar1=salarioDao.buscarPorId(16).get();
		salarioAuxiliar1.setPasion(pasion01);
		salarioDao.guardar(salarioAuxiliar1);

		Salario salarioAuxiliar2=salarioDao.buscarPorId(15).get();
		salarioAuxiliar2.setPasion(pasion01);
		salarioDao.guardar(salarioAuxiliar2);

		Salario salarioAuxiliar3=salarioDao.buscarPorId(14).get();
		salarioAuxiliar3.setPasion(pasion01);
		salarioDao.guardar(salarioAuxiliar3);
		
		Salario salarioAuxiliar4=salarioDao.buscarPorId(13).get();
		salarioAuxiliar4.setPasion(pasion01);
		salarioDao.guardar(salarioAuxiliar4);
			
	    Pasion pasion02= pasionDao.buscarPorId(2).get();
	    Salario salarioAuxiliar5=salarioDao.buscarPorId(12).get();
		salarioAuxiliar5.setPasion(pasion02);
		salarioDao.guardar(salarioAuxiliar5);

		Salario salarioAuxiliar6=salarioDao.buscarPorId(11).get();
		salarioAuxiliar6.setPasion(pasion02);
		salarioDao.guardar(salarioAuxiliar6);

		Salario salarioAuxiliar7=salarioDao.buscarPorId(10).get();
		salarioAuxiliar7.setPasion(pasion02);
		salarioDao.guardar(salarioAuxiliar7);
		
		Salario salarioAuxiliar8=salarioDao.buscarPorId(9).get();
		salarioAuxiliar8.setPasion(pasion02);
		salarioDao.guardar(salarioAuxiliar8);
		
		Pasion pasion03= pasionDao.buscarPorId(3).get();
	    Salario salarioAuxiliar9=salarioDao.buscarPorId(8).get();
		salarioAuxiliar9.setPasion(pasion03);
		salarioDao.guardar(salarioAuxiliar9);
		
		Pasion pasion04= pasionDao.buscarPorId(4).get();
	    Salario salarioAuxiliar10=salarioDao.buscarPorId(7).get();
		salarioAuxiliar10.setPasion(pasion04);
		salarioDao.guardar(salarioAuxiliar10);
		
		Pasion pasion05= pasionDao.buscarPorId(5).get();
	    Salario salarioAuxiliar11=salarioDao.buscarPorId(6).get();
		salarioAuxiliar11.setPasion(pasion05);
		salarioDao.guardar(salarioAuxiliar11);
		
		Salario salarioAuxiliar12=salarioDao.buscarPorId(5).get();
		salarioAuxiliar12.setPasion(pasion05);
		salarioDao.guardar(salarioAuxiliar12);
		
		
		Pasion pasion06= pasionDao.buscarPorId(6).get();
	    Salario salarioAuxiliar13=salarioDao.buscarPorId(4).get();
		salarioAuxiliar13.setPasion(pasion06);
		salarioDao.guardar(salarioAuxiliar13);
		
		Salario salarioAuxiliar14=salarioDao.buscarPorId(3).get();
		salarioAuxiliar14.setPasion(pasion06);
		salarioDao.guardar(salarioAuxiliar14);
		
		Salario salarioAuxiliar15=salarioDao.buscarPorId(2).get();
		salarioAuxiliar15.setPasion(pasion06);
		salarioDao.guardar(salarioAuxiliar15);
		
		Salario salarioAuxiliar16=salarioDao.buscarPorId(1).get();
		salarioAuxiliar16.setPasion(pasion06);
		salarioDao.guardar(salarioAuxiliar16);
		
			
		Salario salarioAuxiliar01=salarioDao.buscarPorId(16).get();
		List<Edad> edades1= (List<Edad>) edadDao.findByIdLessThanEqual(3);
        edades1.forEach(edad->edad.setSalario(salarioAuxiliar01));
        edades1.forEach(edad->edadDao.guardar(edad));
        
		Salario salarioAuxiliar02=salarioDao.buscarPorId(15).get();
		List<Edad> edades2= (List<Edad>) edadDao.findByIdBetween(4, 6);
        edades2.forEach(edad->edad.setSalario(salarioAuxiliar02));
        edades2.forEach(edad->edadDao.guardar(edad));

		Salario salarioAuxiliar03=salarioDao.buscarPorId(14).get();
		List<Edad> edades3= (List<Edad>) edadDao.findByIdBetween(7, 8);
        edades3.forEach(edad->edad.setSalario(salarioAuxiliar03));
        edades3.forEach(edad->edadDao.guardar(edad));
		
		Salario salarioAuxiliar04=salarioDao.buscarPorId(13).get();
		List<Edad> edades4= (List<Edad>) edadDao.findByIdBetween(9, 10);
        edades4.forEach(edad->edad.setSalario(salarioAuxiliar04));
        edades4.forEach(edad->edadDao.guardar(edad));
		
	    Salario salarioAuxiliar05=salarioDao.buscarPorId(12).get();
	    Edad edadUnica= edadDao.buscarPorId(11).get();
	    edadUnica.setSalario(salarioAuxiliar05);
	    edadDao.guardar(edadUnica);

		Salario salarioAuxiliar06=salarioDao.buscarPorId(11).get();
		List<Edad> edades6= (List<Edad>) edadDao.findByIdBetween(12, 13);
        edades6.forEach(edad->edad.setSalario(salarioAuxiliar06));
        edades6.forEach(edad->edadDao.guardar(edad));

		Salario salarioAuxiliar07=salarioDao.buscarPorId(10).get();
		List<Edad> edades7= (List<Edad>) edadDao.findByIdBetween(14, 15);
        edades7.forEach(edad->edad.setSalario(salarioAuxiliar07));
        edades7.forEach(edad->edadDao.guardar(edad));
		
		Salario salarioAuxiliar08=salarioDao.buscarPorId(9).get();
		List<Edad> edades8= (List<Edad>) edadDao.findByIdBetween(16, 17);
        edades8.forEach(edad->edad.setSalario(salarioAuxiliar08));
        edades8.forEach(edad->edadDao.guardar(edad));
		
	    Salario salarioAuxiliar09=salarioDao.buscarPorId(8).get();
	    Edad edadUnica2= edadDao.buscarPorId(18).get();
	    edadUnica2.setSalario(salarioAuxiliar09);
	    edadDao.guardar(edadUnica2);
	
	    Salario salarioAuxiliar010=salarioDao.buscarPorId(7).get();
	    Edad edadUnica3= edadDao.buscarPorId(19).get();
	    edadUnica3.setSalario(salarioAuxiliar010);
	    edadDao.guardar(edadUnica3);
		
		
	    Salario salarioAuxiliar011=salarioDao.buscarPorId(6).get();
	    Edad edadUnica4= edadDao.buscarPorId(20).get();
	    edadUnica4.setSalario(salarioAuxiliar011);
	    edadDao.guardar(edadUnica4);
		
		Salario salarioAuxiliar012=salarioDao.buscarPorId(5).get();
		Edad edadUnica5= edadDao.buscarPorId(21).get();
	    edadUnica5.setSalario(salarioAuxiliar012);
	    edadDao.guardar(edadUnica5);
		
	    Salario salarioAuxiliar013=salarioDao.buscarPorId(4).get();
	    List<Edad> edades13= (List<Edad>) edadDao.findByIdBetween(22, 23);
        edades13.forEach(edad->edad.setSalario(salarioAuxiliar013));
        edades13.forEach(edad->edadDao.guardar(edad));
		
		Salario salarioAuxiliar014=salarioDao.buscarPorId(3).get();
		List<Edad> edades14= (List<Edad>) edadDao.findByIdBetween(24, 26);
        edades14.forEach(edad->edad.setSalario(salarioAuxiliar014));
        edades14.forEach(edad->edadDao.guardar(edad));
		
		Salario salarioAuxiliar015=salarioDao.buscarPorId(2).get();
		List<Edad> edades15= (List<Edad>) edadDao.findByIdBetween(27, 29);
        edades15.forEach(edad->edad.setSalario(salarioAuxiliar015));
        edades15.forEach(edad->edadDao.guardar(edad));
		
		Salario salarioAuxiliar016=salarioDao.buscarPorId(1).get();
		List<Edad> edades16= (List<Edad>) edadDao.findByIdBetween(30, 31);
        edades16.forEach(edad->edad.setSalario(salarioAuxiliar016));
        edades16.forEach(edad->edadDao.guardar(edad));
		
		Tarjeta tarjeta1= tarjetaDao.buscarPorId(1).get();
		Set<Edad> edadesTarjeta1=new HashSet<Edad>();
		edadesTarjeta1.add(edadDao.buscarPorId(1).get());
		edadesTarjeta1.add(edadDao.buscarPorId(2).get());
		edadesTarjeta1.add(edadDao.buscarPorId(4).get());
		edadesTarjeta1.add(edadDao.buscarPorId(7).get());
		edadesTarjeta1.add(edadDao.buscarPorId(9).get());
		edadesTarjeta1.add(edadDao.buscarPorId(31).get());
		edadesTarjeta1.add(edadDao.buscarPorId(30).get());
		edadesTarjeta1.add(edadDao.buscarPorId(28).get());
		edadesTarjeta1.add(edadDao.buscarPorId(27).get());
		edadesTarjeta1.add(edadDao.buscarPorId(25).get());
		edadesTarjeta1.add(edadDao.buscarPorId(23).get());
		edadesTarjeta1.add(edadDao.buscarPorId(22).get());
		edadesTarjeta1.add(edadDao.buscarPorId(24).get());
		tarjeta1.setEdades(edadesTarjeta1);
		tarjetaDao.guardar(tarjeta1);
		
		Tarjeta tarjeta2= tarjetaDao.buscarPorId(2).get();
		Set<Edad> edadesTarjeta2=new HashSet<Edad>();
		edadesTarjeta2.add(edadDao.buscarPorId(2).get());
		edadesTarjeta2.add(edadDao.buscarPorId(3).get());
		edadesTarjeta2.add(edadDao.buscarPorId(5).get());
		edadesTarjeta2.add(edadDao.buscarPorId(6).get());
		edadesTarjeta2.add(edadDao.buscarPorId(8).get());
		edadesTarjeta2.add(edadDao.buscarPorId(19).get());
		tarjeta2.setEdades(edadesTarjeta2);
		tarjetaDao.guardar(tarjeta2);
		
		Tarjeta tarjeta3= tarjetaDao.buscarPorId(3).get();
		Set<Edad> edadesTarjeta3=new HashSet<Edad>();
		edadesTarjeta3.add(edadDao.buscarPorId(2).get());
		edadesTarjeta3.add(edadDao.buscarPorId(1).get());
		edadesTarjeta3.add(edadDao.buscarPorId(4).get());
		edadesTarjeta3.add(edadDao.buscarPorId(5).get());
		edadesTarjeta3.add(edadDao.buscarPorId(7).get());
		edadesTarjeta3.add(edadDao.buscarPorId(9).get());
		edadesTarjeta3.add(edadDao.buscarPorId(22).get());
		edadesTarjeta3.add(edadDao.buscarPorId(24).get());
		edadesTarjeta3.add(edadDao.buscarPorId(28).get());
		edadesTarjeta3.add(edadDao.buscarPorId(27).get());
		tarjeta3.setEdades(edadesTarjeta3);
		tarjetaDao.guardar(tarjeta3);
		
		Tarjeta tarjeta4= tarjetaDao.buscarPorId(4).get();
		Set<Edad> edadesTarjeta4=new HashSet<Edad>();
		edadesTarjeta4.add(edadDao.buscarPorId(20).get());
		tarjeta4.setEdades(edadesTarjeta4);
		tarjetaDao.guardar(tarjeta4);
		
		Tarjeta tarjeta10= tarjetaDao.buscarPorId(10).get();
		Set<Edad> edadesTarjeta10=new HashSet<Edad>();
		edadesTarjeta10.add(edadDao.buscarPorId(20).get());
		tarjeta10.setEdades(edadesTarjeta10);
		tarjetaDao.guardar(tarjeta10);
		
		Tarjeta tarjeta14= tarjetaDao.buscarPorId(14).get();
		Set<Edad> edadesTarjeta14=new HashSet<Edad>();
		edadesTarjeta14.add(edadDao.buscarPorId(20).get());
		tarjeta14.setEdades(edadesTarjeta14);
		tarjetaDao.guardar(tarjeta14);
		
		Tarjeta tarjeta15= tarjetaDao.buscarPorId(15).get();
		Set<Edad> edadesTarjeta15=new HashSet<Edad>();
		edadesTarjeta15.add(edadDao.buscarPorId(18).get());
		tarjeta15.setEdades(edadesTarjeta15);
		tarjetaDao.guardar(tarjeta15);
		
		Tarjeta tarjeta16= tarjetaDao.buscarPorId(16).get();
		Set<Edad> edadesTarjeta16=new HashSet<Edad>();
		edadesTarjeta16.add(edadDao.buscarPorId(20).get());
		tarjeta16.setEdades(edadesTarjeta16);
		tarjetaDao.guardar(tarjeta16);
		
		Tarjeta tarjeta17= tarjetaDao.buscarPorId(17).get();
		Set<Edad> edadesTarjeta17=new HashSet<Edad>();
		edadesTarjeta17.add(edadDao.buscarPorId(20).get());
		tarjeta17.setEdades(edadesTarjeta17);
		tarjetaDao.guardar(tarjeta17);
		
		Tarjeta tarjeta18= tarjetaDao.buscarPorId(18).get();
		Set<Edad> edadesTarjeta18=new HashSet<Edad>();
		edadesTarjeta18.add(edadDao.buscarPorId(21).get());
		tarjeta18.setEdades(edadesTarjeta18);
		tarjetaDao.guardar(tarjeta18);
		
		Tarjeta tarjeta5= tarjetaDao.buscarPorId(5).get();
		Set<Edad> edadesTarjeta5=new HashSet<Edad>();
		edadesTarjeta5.add(edadDao.buscarPorId(18).get());
		tarjeta5.setEdades(edadesTarjeta5);
		tarjetaDao.guardar(tarjeta5);
		
		Tarjeta tarjeta6= tarjetaDao.buscarPorId(6).get();
		Set<Edad> edadesTarjeta6=new HashSet<Edad>();
		edadesTarjeta6.add(edadDao.buscarPorId(2).get());
		edadesTarjeta6.add(edadDao.buscarPorId(3).get());
		edadesTarjeta6.add(edadDao.buscarPorId(5).get());
		edadesTarjeta6.add(edadDao.buscarPorId(6).get());
		edadesTarjeta6.add(edadDao.buscarPorId(8).get());
		edadesTarjeta6.add(edadDao.buscarPorId(19).get());
		tarjeta6.setEdades(edadesTarjeta6);
		tarjetaDao.guardar(tarjeta6);
		
		Tarjeta tarjeta7= tarjetaDao.buscarPorId(7).get();
		Set<Edad> edadesTarjeta7=new HashSet<Edad>();
		edadesTarjeta7.add(edadDao.buscarPorId(11).get());
		edadesTarjeta7.add(edadDao.buscarPorId(12).get());
		edadesTarjeta7.add(edadDao.buscarPorId(13).get());
		edadesTarjeta7.add(edadDao.buscarPorId(14).get());
		edadesTarjeta7.add(edadDao.buscarPorId(15).get());
		edadesTarjeta7.add(edadDao.buscarPorId(16).get());
		tarjeta7.setEdades(edadesTarjeta7);
		tarjetaDao.guardar(tarjeta7);
		
		Tarjeta tarjeta8= tarjetaDao.buscarPorId(8).get();
		Set<Edad> edadesTarjeta8=new HashSet<Edad>();
		edadesTarjeta8.add(edadDao.buscarPorId(2).get());
		edadesTarjeta8.add(edadDao.buscarPorId(3).get());
		tarjeta8.setEdades(edadesTarjeta8);
		tarjetaDao.guardar(tarjeta8);
		
		Tarjeta tarjeta9= tarjetaDao.buscarPorId(9).get();
		Set<Edad> edadesTarjeta9=new HashSet<Edad>();
		edadesTarjeta9.add(edadDao.buscarPorId(2).get());
		edadesTarjeta9.add(edadDao.buscarPorId(3).get());
		edadesTarjeta9.add(edadDao.buscarPorId(5).get());
		edadesTarjeta9.add(edadDao.buscarPorId(6).get());
		edadesTarjeta9.add(edadDao.buscarPorId(8).get());
		edadesTarjeta9.add(edadDao.buscarPorId(19).get());
		tarjeta9.setEdades(edadesTarjeta9);
		tarjetaDao.guardar(tarjeta9);
		
		Tarjeta tarjeta11= tarjetaDao.buscarPorId(11).get();
		Set<Edad> edadesTarjeta11=new HashSet<Edad>();
		edadesTarjeta11.add(edadDao.buscarPorId(2).get());
		edadesTarjeta11.add(edadDao.buscarPorId(3).get());
		edadesTarjeta11.add(edadDao.buscarPorId(5).get());
		edadesTarjeta11.add(edadDao.buscarPorId(6).get());
		edadesTarjeta11.add(edadDao.buscarPorId(8).get());
		edadesTarjeta11.add(edadDao.buscarPorId(19).get());
		tarjeta11.setEdades(edadesTarjeta11);
		tarjetaDao.guardar(tarjeta11);
		
		Tarjeta tarjeta12= tarjetaDao.buscarPorId(12).get();
		Set<Edad> edadesTarjeta12=new HashSet<Edad>();
		edadesTarjeta12.add(edadDao.buscarPorId(5).get());
		edadesTarjeta12.add(edadDao.buscarPorId(6).get());
		edadesTarjeta12.add(edadDao.buscarPorId(26).get());
		tarjeta12.setEdades(edadesTarjeta12);
		tarjetaDao.guardar(tarjeta12);
		
		Tarjeta tarjeta13= tarjetaDao.buscarPorId(13).get();
		Set<Edad> edadesTarjeta13=new HashSet<Edad>();
		edadesTarjeta13.add(edadDao.buscarPorId(8).get());
		edadesTarjeta13.add(edadDao.buscarPorId(10).get());
		edadesTarjeta13.add(edadDao.buscarPorId(13).get());
		edadesTarjeta13.add(edadDao.buscarPorId(15).get());
		edadesTarjeta13.add(edadDao.buscarPorId(17).get());
		edadesTarjeta13.add(edadDao.buscarPorId(31).get());
		edadesTarjeta13.add(edadDao.buscarPorId(29).get());
		edadesTarjeta13.add(edadDao.buscarPorId(28).get());
		tarjeta13.setEdades(edadesTarjeta13);
		tarjetaDao.guardar(tarjeta13);
	}
}

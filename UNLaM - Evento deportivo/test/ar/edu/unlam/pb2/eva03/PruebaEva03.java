package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class PruebaEva03 {
	//test commit 
	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", nuevo.getEstiloDeNado());
		assertEquals((Integer)1, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
		nuevo.setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)50000, nuevo.getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNumeroDeSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta(4, "Luna", "Olimpico", TipoDeBicicleta.TRIA, "Espalda");
		
		assertEquals("Olimpico", nuevo.getDistanciaPreferida());
		assertEquals(TipoDeBicicleta.TRIA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El numero de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", "Olimpico", TipoDeBicicleta.RUTA, "Espalda"));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA, "Espalda"));
			
		assertEquals((Integer) 10, actual.getCantidadSocios());		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		// En las carreras de natacion solo pueden inscribirse los que sean INadador
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		Evento acuatica = new Evento (TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		actual.inscribirEnEvento(acuatica, celeste);	
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
		// En los triatlones s�lo pueden inscribirse los que sean INadador & ICiclista
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		Evento triatlon = new Evento(TipoDeEvento.TRIATLON_IRONMAN, "Triatlon Khona");
		actual.inscribirEnEvento(triatlon, celeste);		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparado{		
		Socio celeste = new Corredor(999, "Celeste", 42000);
		Club actual = new Club("Moron");
		actual.agregarDeportista(celeste);		
		((Corredor)celeste).setCantidadDeKilometrosEntrenados(100000);
		Evento maraton = new Evento(TipoDeEvento.CARRERA_42K, "Maraton de New York");
		actual.inscribirEnEvento(maraton, celeste);
		Integer valorEsperado = 1;
		Integer valorObtenido = actual.cantidadDeInscriptosAlEvento();
		assertEquals(valorEsperado, valorObtenido);		
	}
}

package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Socio> socios = new HashSet ();
	private Map<Evento, Socio> competencias = new HashMap ();
	private Integer cantidadDeSocios = 0;
	
	public Club(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarDeportista(Socio deportistaIncluido) {
		socios.add(deportistaIncluido);
		cantidadDeSocios ++;
		
		if(socios.size()==cantidadDeSocios) {
			return true;
		} else { 
			cantidadDeSocios --;
			return false;
	} 
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}


	public void inscribirEnEvento(Evento eventoAInscribir, Socio socioAInscribir) throws NoEstaPreparado {
		switch (eventoAInscribir.getTipo()) {

	    case CARRERA_NATACION_EN_AGUAS_ABIERTAS:

	    	if(socioAInscribir instanceof INadador) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;

	    case CARRERA_NATACION_EN_PICINA:

	    	if(socioAInscribir instanceof INadador) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_5K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_10K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_21K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_42K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case DUATLON:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_SHORT:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_OLIMPICO:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_MEDIO:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_IRONMAN:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
		

		}
	
	}

	public Integer cantidadDeInscriptosAlEvento() {
		return competencias.size();
	}
	
}

package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Socio implements ICiclista {
	private TipoDeBicicleta tipoDeBicicletaElegido;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tipoDeBicicletaElegido) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicletaElegido = tipoDeBicicletaElegido;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicletaElegido;
	}
	

}

package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Socio implements INadador {
	private String estiloDeNado;

	public Nadador(Integer numeroDeSocio, String nombre, String estiloDeNado) {
		super(numeroDeSocio, nombre);
		this.estiloDeNado = estiloDeNado;
	}

	@Override
	public String getEstiloDeNado() {
		return estiloDeNado;
	}
	

}

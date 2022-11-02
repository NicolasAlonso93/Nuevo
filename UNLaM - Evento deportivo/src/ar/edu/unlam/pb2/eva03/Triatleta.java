package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Socio implements ICorredor, INadador, ICiclista {
	private String distanciaPreferidaACorrer;
	private TipoDeBicicleta tipoDeBicicletaElegida;
	private Integer totalDeKilometrosEntrenados = 0;
	private String estiloDeNado;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferidaACorrer, TipoDeBicicleta tipoDeBicicletaElegida, String estiloDeNado) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferidaACorrer = distanciaPreferidaACorrer;
		this.tipoDeBicicletaElegida =  tipoDeBicicletaElegida;
		this.estiloDeNado = estiloDeNado;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		totalDeKilometrosEntrenados = totalDeKilometrosEntrenados + km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return totalDeKilometrosEntrenados;
	}

	@Override
	public String getEstiloDeNado() {
		return estiloDeNado;
	}

	public Object getDistanciaPreferida() {
		return distanciaPreferidaACorrer;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicletaElegida;
	}

	

}

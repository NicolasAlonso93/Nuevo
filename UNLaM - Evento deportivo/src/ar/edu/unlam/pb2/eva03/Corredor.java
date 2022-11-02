package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Socio implements ICorredor{
	private Integer distanciaPreferida;
	private Integer kmEntrenados =0;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		kmEntrenados = kmEntrenados + km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kmEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}
	

}

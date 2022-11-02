package ar.edu.unlam.pb2.eva03;

public class NoEstaPreparado extends Exception {
	private String mensaje = "El deportista no esta preparado";
	 public NoEstaPreparado(String mensaje) {
	      super(mensaje);
	    }
}

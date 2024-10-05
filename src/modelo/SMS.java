package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class SMS extends Mensaje {
private int numeroOrigen;
private int numeroDestino;
private String texto;
private boolean visto;
private OperadorMovil operadorOrigen;
private OperadorMovil operadorDestino;
public int getNumeroOrigen() {
	return numeroOrigen;
}
public void setNumeroOrigen(int numeroOrigen) {
	this.numeroOrigen = numeroOrigen;
}
public int getNumeroDestino() {
	return numeroDestino;
}
public void setNumeroDestino(int numeroDestino) {
if(String.valueOf(numeroDestino).length()!=10);
this.numeroDestino=numeroDestino;
	
}
public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}
public boolean isVisto() {
	return visto;
}
public void setVisto(boolean vito) {
	this.visto = vito;
}
public OperadorMovil getOperadorOrigen() {
	return operadorOrigen;
}
public void setOperadorOrigen(OperadorMovil operadorOrigen) {
	this.operadorOrigen = operadorOrigen;
}
public OperadorMovil getOperadorDestino() {
	return operadorDestino;
}
public void setOperadorDestino(OperadorMovil operadorDestino) {
	this.operadorDestino = operadorDestino;
}
public SMS(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino, String texto,
		boolean visto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) {
	super(idMensaje, fechaEnvio, horaEnvio);
	this.numeroOrigen = numeroOrigen;
	setNumeroDestino(numeroDestino);
	this.texto = texto;
	this.visto = visto;
	this.operadorOrigen = operadorOrigen;
	this.operadorDestino = operadorDestino;
}
@Override
public String toString() {
	return "\nSMS [+ fechaEnvio= "+fechaEnvio+" + HoraEnvio "+HoraEnvio + " numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", texto=" + texto + ", visto="
			+ visto + ", operadorOrigen=" + operadorOrigen + ", operadorDestino=" + operadorDestino + "]";
			
}






}

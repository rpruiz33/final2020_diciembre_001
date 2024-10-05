package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Email extends Mensaje {
private String origen;
private String destino;
private String Asunto;
private String Cuerpo;
private boolean recibido;
public String getOrigen() {
	return origen;
}
public void setOrigen(String origen) {
	this.origen = origen;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino)throws Exception {
if(destino.indexOf("@")==-1) throw new  Exception("falts el @") ;
	this.destino=destino;

}
public String getAsunto() {
	return Asunto;
}
public void setAsunto(String asunto) {
	Asunto = asunto;
}
public String getCuerpo() {
	return Cuerpo;
}
public void setCuerpo(String cuerpo) {
	Cuerpo = cuerpo;
}
public boolean isRecibido() {
	return recibido;
}
public void setRecibido(boolean recibido) {
	this.recibido = recibido;
}
public Email(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String asunto,
		String cuerpo, boolean recibido)throws Exception {
	super(idMensaje, fechaEnvio, horaEnvio);
	this.origen = origen;
	setDestino(destino);
	Asunto = asunto;
	Cuerpo = cuerpo;
	this.recibido = recibido;
}
@Override
public String toString() {
	return "\nEmail [origen=" + origen + ", destino=" + destino + ", Asunto=" + Asunto + ", Cuerpo=" + Cuerpo
			+ ", recibido=" + recibido + "]";
}



}

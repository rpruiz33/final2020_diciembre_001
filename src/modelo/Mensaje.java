package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Mensaje {
protected int idMensaje;
protected LocalDate fechaEnvio;
protected LocalTime HoraEnvio;
public int getIdMensaje() {
	return idMensaje;
}
public void setIdMensaje(int idMensaje) {
	this.idMensaje = idMensaje;
}
public LocalDate getFechaEnvio() {
	return fechaEnvio;
}
public void setFechaEnvio(LocalDate fechaEnvio) {
	this.fechaEnvio = fechaEnvio;
}
public LocalTime getHoraEnvio() {
	return HoraEnvio;
}
public void setHoraEnvio(LocalTime horaEnvio) {
	HoraEnvio = horaEnvio;
}
public Mensaje(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio) {
	super();
	this.idMensaje = idMensaje;
	this.fechaEnvio = fechaEnvio;
	HoraEnvio = horaEnvio;
}
@Override
public String toString() {
	return "Mensaje [idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", HoraEnvio=" + HoraEnvio + "]";
}



}

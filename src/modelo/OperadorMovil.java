package modelo;

public class OperadorMovil {
private int codigoMovil;
private String compañiaMovil;

public int getCodigoMovil() {
	return codigoMovil;
}
public void setCodigoMovil(int codigoMovil) {
	this.codigoMovil = codigoMovil;
}
public String getCompañiaMovil() {
	return compañiaMovil;
}
public void setCompañiaMovil(String compañiaMovil) {
	this.compañiaMovil = compañiaMovil;
}
public OperadorMovil(int codigoMovil, String compañiaMovil) {
	super();
	this.codigoMovil = codigoMovil;
	this.compañiaMovil = compañiaMovil;
}
@Override
public String toString() {
	return "OperadorMovil [codigoMovil=" + codigoMovil + ", compañiaMovil=" + compañiaMovil + "]";
}




}

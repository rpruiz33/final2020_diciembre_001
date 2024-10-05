package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
List <Mensaje> listaMensajes;

public List<Mensaje> getListaMensajes() {
	return listaMensajes;
}

public void setListaMensajes() {
	this.listaMensajes = new ArrayList<Mensaje>();
}

public Sistema() {
	super();
	this.listaMensajes = new ArrayList<Mensaje>();
}

public boolean agregarEmail(LocalDate fechaEnvio,LocalTime horaEnvvio, String origen, String destino, String asunto, String cuerpo)throws Exception {
	int id=1;
	if(listaMensajes.size()>0) {
		id=listaMensajes.get(listaMensajes.size()-1).getIdMensaje()+1;
	}
	return  listaMensajes.add(new Email(id,fechaEnvio, horaEnvvio, origen,destino, asunto, cuerpo, false));
	
}

public boolean  agregarSMS(LocalDate fechaEnvio,LocalTime horaEnvio,int numeroOrigen , int numeroDestino, String texto,OperadorMovil operadorOrigen,OperadorMovil operadorDestino) {
	int id=1;
		if(listaMensajes.size()>0) {
		id=listaMensajes.get(listaMensajes.size()-1).getIdMensaje()+1;
	}
	return  listaMensajes.add(new SMS(id,fechaEnvio,  horaEnvio,  numeroOrigen,  numeroDestino,  texto,
			 false,  operadorOrigen,  operadorDestino));
}



public Mensaje traerMesaje(int idMensaje) {
	Mensaje msj=null;
	int i=0;
	boolean flag=false;
	while(i<listaMensajes.size()&& (flag==false)) {
		if(listaMensajes.get(i).getIdMensaje()==idMensaje&& listaMensajes.get(i)instanceof SMS) {
			
			msj=(SMS)listaMensajes.get(i);
			SMS mensa=(SMS)msj;
			mensa.setVisto(true);
			flag=true;
		}
		else {
		 if(listaMensajes.get(i).getIdMensaje()==idMensaje && listaMensajes.get(i)instanceof Email) {
			
			msj=(Email)listaMensajes.get(i);
			Email men=(Email)msj;
					men.setRecibido(true);
			
			flag=true;
		}
		
	}
		i++;
	}

	return  msj;

}
public OperadorMovil operadores(int i) {
    OperadorMovil[] operadores = new OperadorMovil[]{
            new OperadorMovil(1, "Claro"),
            new OperadorMovil(2, "Movistar"),
            new OperadorMovil(3, "Personal")
          
        };
    return operadores[i];
}

public List<Mensaje> traerMensaje(String nombreCompañia) {

	    List<Mensaje> msj = new ArrayList<>();
	    for (int i=0;i<listaMensajes.size();i++) {
	    	listaMensajes.get(i);
	    	if(listaMensajes.get(i) instanceof SMS) {
	    		SMS sms=(SMS)listaMensajes.get(i);
	    	if(sms.getOperadorOrigen().getCompañiaMovil().equals(nombreCompañia)) {
	    		msj.add(sms); 
	    	}
	    	}
	
	    }
	    return msj; 
	}
public List<Mensaje>traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta){

		List<Mensaje> msj=new ArrayList<Mensaje>();
	    for (int i=0;i<listaMensajes.size();i++) {
	    	listaMensajes.get(i);
	    	if(listaMensajes.get(i) instanceof SMS) {
	    		SMS sms=(SMS)listaMensajes.get(i);
	    	if(sms.getFechaEnvio().equals(fecha)&&sms.getHoraEnvio().isAfter(horaDesde)&& sms.getHoraEnvio().isBefore(horaHasta)|| sms.getHoraEnvio().equals(horaDesde)|| sms.getHoraEnvio().equals(horaHasta)){
	    		msj.add(sms); 
	    	}
	    	}
	    	
	    	
	    
	
	    }
	
	return msj;
}

public List<Mensaje>traerMensaje(LocalDate fecha, LocalTime horaDesde , LocalTime horaHasta,String codigoCompania){
	List<Mensaje> msj=new ArrayList<Mensaje>();
    for (int i=0;i<listaMensajes.size();i++) {
    	listaMensajes.get(i);
    	if(listaMensajes.get(i) instanceof SMS) {
    		SMS sms=(SMS)listaMensajes.get(i);
    	if(sms.getFechaEnvio().equals(fecha)&&sms.getHoraEnvio().isAfter(horaDesde)&& sms.getHoraEnvio().isBefore(horaHasta)|| sms.getHoraEnvio().equals(horaDesde)|| 
    			sms.getHoraEnvio().equals(horaHasta)&& (sms.getOperadorOrigen().getCodigoMovil()==Integer.parseInt(codigoCompania))){
    		msj.add(sms); 
    	}
    	}
    	
    	
    

    }

return msj;
}

}
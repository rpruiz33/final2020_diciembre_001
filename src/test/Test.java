package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Email;
import modelo.OperadorMovil;
import modelo.SMS;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sistema sistema=new Sistema();
		System.out.println("1-1");
		System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567 ,159876543,"Estoy Rindiendo el final de oo1",sistema.operadores(1),sistema.operadores(1)));
		System.out.println("1-2");
		System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567 ,1598765432,"Estoy Rindiendo el final de oo1",sistema.operadores(1),sistema.operadores(1)));
		
		try {
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16,28),"oo1@Unla.gob.ar","alumno.com.ar", "Orientacionn a objetos", "estimado alumno debe presentarse a rendir al final de oo1 el dia 1/12 a las 9 hs"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16,28),"oo1@Unla.gob.ar","al@gmailcom.ar", "Orientacionn a objetos", "estimado alumno debe presentarse a rendir al final de oo1 el dia 1/12 a las 9 hs"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema.getListaMensajes());
		System.out.println("2-1");
		
		System.out.println(sistema.traerMesaje(1).toString());

		
		System.out.println("2-2");
		System.out.println(sistema.traerMesaje(3).toString());
		System.out.println("3");
		System.out.println(sistema.agregarSMS(LocalDate.of(2020, 11, 20), LocalTime.of(17, 19), 151234567 ,1598765431,"recibido ok",sistema.operadores(2),sistema.operadores(2)));
		System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567 ,1598765430,"gracias",sistema.operadores(2),sistema.operadores(2)));
		try {
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 11, 20), LocalTime.of(17,15),"oo1@Unla.gob.ar","alumno@gmailcom.ar", "Orientación a Objetos 1 - UNLa", "Se adjunta la grilla de inscripciones al final de Diciembre"));
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 11, 20), LocalTime.of(15,12),"info@gmail.com.ar","persona@gmail.com.ar", "Promoción", "Aproveche nuestras promociones"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("imprimir la lista");
		System.out.println(sistema.getListaMensajes());
		System.out.println("4-1");
		System.out.println(sistema.traerMensaje("Personal"));
		System.out.println((4-2));
		System.out.println(sistema.traerMensaje(LocalDate.of(2020,11,20), LocalTime.of(16,0) , LocalTime.of (18,0)));
		
		System.out.println("4-3");
		System.out.println(sistema.traerMensaje(LocalDate.of(2020, 12, 10) ,LocalTime.of(16,0) , LocalTime.of (18,0),"1"));
	}

}

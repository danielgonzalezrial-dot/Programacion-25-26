package sentenciaSeleccion;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Menú usuario:
		//a) El progrtama da los buenos dias
		//b) Mensaje optimista aleatorio
		//c) Mensaje pesimista aleatori
					
		//Leer la opcion que el usuario introdujo por teclado
		;
		//String opcion = lector.next();
	    char opcion ;
	   boolean error = false;
		
		do {		
			error= false;//Se tiene que meter aqui para que se reinicie a false
			System.out.println("ESCOJA UNA OPCION : \na) El programa da los buenos dias\n"
					+ "b) Mensaje optimista aleatorio\n"
					+ "c) Mensaje pesimista aleatorio");
			Scanner lector = new Scanner (System.in);
			opcion = lector.next().charAt(0);
			switch (opcion) {
			case 'a':
				System.out.println("Muy buenos dias");
				break;
			case 'b':
				System.out.println("El celta se salvara esta temporada");
				break;
			case 'c':
				System.out.println("Seguira subiendo el precio de la gasolina");
				break;
			default:
				System.out.println("Opcion no valida");
				error = true;
				break;
			}
		}
		while(error);                  //while(opcion != 'a' && opcion!='b' && opcion!= 'c');
		}
	}
		


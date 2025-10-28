package RepasoTemasAnteriores;

import java.util.Scanner;

public class Ejercicio2RepasoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que pide al ususario que genmere un password que cumpla las siguientes condiciones
		
		//Tener al menos 4 caracteres
		//Tener al menos una mayuscula 
		//No puede empezar por un número
		//El usuario tiene 3 oportunidades
		boolean correcto;
		
		String password; 
		Scanner lector = new Scanner(System.in);
		int contador = 0;
		do {
			
			contador ++;
			switch(contador) {
			case 2:
				System.out.println("Te quedan 2 intentos");
				break;
			case 3:
				System.out.println("Te queda un intento");
				break;
			}
			System.out.println("Introduce el password");
			password = lector.next();
			
			correcto = false;
		
		if (password.length()>=4) {
			if (!Character.isDigit(password.charAt(0))) {
				if (!password.equals(password.toLowerCase())){
					correcto = true;
				}
				else {
					System.out.println("Debe tener al menos 1 mayuscula");
				}
			}
			else {
				System.out.println("No puede empezar por un digito");
			}
		}
		else {
			System.out.println("Debe tener al menos 4 caracteres");
		}
		
		if (correcto) {
			System.out.println("El password es correcto");
		}
		else {
			System.out.println("El password no es correcto, has agotado todos los intentos");
		}
		}
		
		while (!correcto && contador<3);
		}
	}


		
	


		
		

	



package RepasoTemasAnteriores;

import java.util.Random;

public class Ejercicio3RepasoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que genera un password de forma aleatoria
		char[] caracteres = {'a','b','c','d','e','f','g','h','i'};
		StringBuilder password = new StringBuilder();
		Random generador = new Random();
		//Generar password de n caracteres
		int tamanho = generador.nextInt(4,25);
		
		int numeroPasswords = 10;
		
		int j = 0;
		
		while (j<numeroPasswords) {		
						
		int i = 0;
		password.delete(0, password.length());
		while(i<tamanho) {
			//Generar uno de los caracteres permitidos
			password.append(caracteres[generador.nextInt(12)]);
			i++;
		}
		//Añadir una mayuscula
		password.insert(generador.nextInt(password.length()), Character.toUpperCase(caracteres[generador.nextInt(12)]));
		
		System.out.println("Password generada: " + password);
	     j++;
		}
	}
	}



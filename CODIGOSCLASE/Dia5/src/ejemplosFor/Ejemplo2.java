package ejemplosFor;

import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llenar un array con numeros aleatorios entre 0 y 100
		//Mostrar el array por pantalla
		//En aquellas posiciones donde haya un 0 poner un numero negativo
		
		int [] valores = new int[20];
		Random generador = new Random();
		
		for (int i=0;i<valores.length;i++) {
			valores[i]=generador.nextInt(0,300);
		}
		
		
		//Mostrar el array por pantalla
		
		for (int valor : valores) {
			System.out.print(valor + " ");
			
			
		}
		
		//Cambiar posiciones en las que haya un cero por un numero negativo
		for (int i = 0;i<valores.length;i++) {
			if(valores [i]== 0) {
				valores [i] =-1;
			}
		}
		
		//Mostrar el array generado
		System.out.println();
		for (int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
		
		//Posicion en la que esta el primer numero negativo
		int posicion = -1;
		boolean encontrado = false;
		for (int i = 0;i<valores.length;i++) {
			if(valores [i]< 0) {
				posicion = i;
				encontrado = true;
				System.out.println("Posicion primer negativo : " + i);;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No hay numeros negativos");
		
		if (posicion <0) {
			System.out.println("No hay numeros negativos");
		}

	}
	}
}

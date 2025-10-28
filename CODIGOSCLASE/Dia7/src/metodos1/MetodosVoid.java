package metodos1;

import java.util.Random;

public class MetodosVoid {
	
	//Son métodos que no devuelven ningun valor:
	//Normalmente porque modifican el valor de alguno de los argumentos que reciben 
	//o porque directamente lo envian a un medio externo al programa; Consola, fichero
	
	//Método que llena una matriz de enteros con numeros aleatorios (Acceso publico)
	public static void llenarArray (int[] x) {
		Random generador = new Random();
		
		for (int i = 0;i<x.length;i++) {
			x[i]= generador.nextInt();
		}
	}
	
	public static void llenarArray (int[] x,int limite) {
		Random generador = new Random();
		
		for (int i = 0;i<x.length;i++) {
			x[i]= generador.nextInt(limite+1);
		}
	}
	public static void llenarArray (int[] x,int limiteinferior, int limiteSuperior) {
		Random generador = new Random();
		
		for (int i = 0;i<x.length;i++) {
			x[i]= generador.nextInt(limiteinferior,limiteSuperior+1);
		}
	}
	
	
	//Método que muestra por consola el array que recibe como argumento
	public static void mostrarArray (int[] x) {
		for(int valor : x) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}

}

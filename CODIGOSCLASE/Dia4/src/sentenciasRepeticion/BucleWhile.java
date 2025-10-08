package sentenciasRepeticion;

import java.util.Arrays;
import java.util.Random;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ej1: Programa que muestre los numeros del 1 al 50
		
		int i = 1;
		
		while (i <= 50)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("****************EJEMPLO2*******************");
		//Ej2 : Programa que llena una matriz con muneros aleatorios entre -10 y 10
		
		int[] matriz = new int [20];
		Random generador = new Random();
		int j = 0;
		while(j<matriz.length) 
		{
			matriz[j] = generador.nextInt(-10,11);
			j++;
			
		}
		System.out.println("Matriz generada: ");
		System.out.println(Arrays.toString(matriz));
		
		
		
		//Ej 3: Programa que muestra los valores pares almacenados en la matriz
		
		System.out.println("**************************EJEMPLO3*********************");
		
		//Reseteo j
		j = 0;
		System.out.println("Valores pares de la matriz");
		while ( j < matriz.length) {
			if (matriz [j] % 2 == 0) {
				System.out.print(matriz[j] + " ");
			}
			
			j++;
		}
		System.out.println();
		//EJ 4: Programa que calucla la suma de los valores de la matriz
		
		int suma = 0;
		j = 0; //reseteamos j de nuevo
		while (j < matriz.length) {
			suma = suma + matriz[j];
			j++;
		}
		
		System.out.println("la suma es: " + suma);
		// Ej 5: Programa que indica si un numero es primo.
		
		int numero = 4;
		boolean  primo = true;
		int k = 2;
		
		while ( k<= numero/2) 
		{
			if (numero%k == 0)
			{
				primo = false;
				break;
				
			}
			k ++;
			
		}
		if (primo) {
		System.out.println("Es un numero primo");
		
		
		}
		else {
			System.out.println("No es un numero primo");
		}
		
		System.out.println("***********BUVLES ANIDADOS************");
		//Mostrar todos los numeros primos de una matriz
		
		int  [] valores = {4,5,6,7,56,345,56,345,234,23,4,};
		
		i = 0; //Reseteamos
		j = 0;
		
		while (i<valores.length){
			//Reseteamos variable booleana primo
			primo = true;
			j=2;
			while(j<valores[i]/2) {
				if (valores[i]%j == 0) {
					primo = false;
					break;
				}
			j++;
			
		}
		
		if (primo) 
		{
			System.out.println(valores[i] + " ");
		}	
				
			i++;
			
		}
	}
}
	
	
      
	
	
	


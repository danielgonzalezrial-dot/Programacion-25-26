package ejemplosFor;

import java.util.Arrays;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa qeu muestra todos los numeros entre 1 y 10
		//Variable control -> Inicializar-> condicion de continuidad -> modificarse dentro del bucle
		
		
		for (int i = 1; i <=10;i = i + 1) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		//Programa que muestra por pantalla los vlaores de un array
		
		int[] valores = {5,6,7,8,9};
		
		for (int i=0; i < valores.length; i++)
		{
			System.out.print(valores[i] + " ");
		}
		
		//Proigrama que muestre los numeros pares almacenados en el array
		System.out.println();
		for (int i=0; i < valores.length; i++) {
			if (valores[i]%2==0) {
				System.out.print(valores[i] + " ");
			}
			
		}

	}

}

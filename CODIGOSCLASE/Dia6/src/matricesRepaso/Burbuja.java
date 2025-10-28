package matricesRepaso;

import java.util.Random;

public class Burbuja {

	public static void main(String[] args) {

		int[] numeros = new int[7];
		Random generador = new Random();

		// Rellenar con números aleatorios 0-100
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generador.nextInt(101);
		}

		System.out.println("Matriz original: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		// Método burbuja: ordenar de menor a mayor comparando elementos
		boolean intercambio;

		for (int j = 0; j < numeros.length - 1; j++) {
			intercambio = false;

			for (int i = 0; i < numeros.length - 1 - j; i++) {
				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
					intercambio = true;
				}
			}

			// Mostrar cómo queda la matriz tras cada iteración
			System.out.println("Iteración número: " + (j + 1));
			for (int i1 = 0; i1 < numeros.length; i1++) {
				System.out.print(numeros[i1] + " ");
			}
			System.out.println();

			if (!intercambio) {
				System.out.println("Matriz OPrdenada");
				
				break; // si no hubo intercambios, ya está ordenado
			}
		}

		System.out.println("\nMatriz ordenada:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}


}





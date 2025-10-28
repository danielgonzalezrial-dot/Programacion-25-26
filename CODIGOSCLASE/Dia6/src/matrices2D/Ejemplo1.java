package matrices2D;

import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar una matriz 2d con 4 filas y 5 columnas
		//LLenarla con numeros aleatoreios entre 0 y 50
		//Mostrar por pantalla la matriz generrada
		//calcular la suma de la primera fila
		//Contar numeros pares de la ultima columna
		
		int [][] matriz = new int [4][5];

        int numFilas = matriz.length;        // 4
        int columnas = matriz[0].length;     // 5
        System.out.println("La matriz tiene " + numFilas + " filas y " + columnas + " columnas");

        Random generador = new Random();

        // Llenar con aleatorios 0..50
        for (int fila = 0; fila < numFilas; fila++) {
            for (int col = 0; col < columnas; col++) {
                matriz[fila][col] = generador.nextInt(51);
            }
        }

        // Mostrar la matriz (en forma de tabla)
        System.out.println("\nMatriz generada:");
        for (int fila = 0; fila < numFilas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fila][col] + "\t"); // print (no println) y tabulador
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Suma de la primera fila (fila 0) -> usar nº de columnas
        int sumaPrimeraFila = 0;
        for (int col = 0; col < columnas; col++) {
            sumaPrimeraFila += matriz[0][col];
        }
        System.out.println("\nSuma de la primera fila: " + sumaPrimeraFila);

        // Contar pares en la última columna 
        int contador= 0;
        
        for (int j = 0;j<matriz.length;j++) {
        	if (matriz[j][matriz[j].length-1]%2==0 && matriz[j][matriz[j].length-1]!= 0 ) {
        		contador++;
            }
        }
        System.out.println("Números pares en la última columna: " + contador);
        
        //Se puede recorrer una matriz 2D con bucles for mejorado
        //Repaso con un array de 1D
        int [] a = {6,7,5,4,3,1};
        for (int valor : a) {
        	System.out.print(valor + "\t");
        }
        
        System.out.println();
        System.out.println();
        
        //Mostramos la matriz 2D con  un for mejorado
        
        for (int [] fila:matriz)
        {for (int valor : fila) {
        	System.out.print(valor + "\t" );
        }
        
        System.out.println();
        	
        }
        
        
    }
}




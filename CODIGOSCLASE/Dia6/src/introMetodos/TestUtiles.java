package introMetodos;

import java.util.Arrays;

public class TestUtiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test método clase utiles
		
		int[] prueba  = new int [5];
		
		Utiles.llenarMatriz(prueba);
		System.out.println(Arrays.toString(prueba));
		
		int suma = Utiles.sumaMatriz(prueba);
		System.out.println("La suma es " + suma);
		

	}

}

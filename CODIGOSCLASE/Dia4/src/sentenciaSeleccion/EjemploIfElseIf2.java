package sentenciaSeleccion;

import java.util.Random;

public class EjemploIfElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Progrmaa que determina si un numero positivo tiene 1,2,3 o mas cifras
		
		//El numero lo generamos de forma aleatoria
		
		Random generador = new Random();
		
		
		//Vamos a generar 10 numeros aleatorios y ver cuantas cifras tienen
		
		int contador= 0;
		
		do {	
			
				int numero = generador.nextInt(2000);
				
				if (numero <0)
				{
					System.out.println("Error en la entrada, el numero no puede ser negativo");
				}
				
				else if(numero<10)
				{
					System.out.println(numero + " tiene una cifra");
							
				}
				else if (numero<100) 
				{
					System.out.println(numero + " tiene dos cifras" );
				}
				
				else 
				{
					System.out.println(numero + " tiene 3 o mas cifras");
				}
				
		    contador++;
		} //Llave que cierra el do
		while (contador<10);
		
		
		

	}

}

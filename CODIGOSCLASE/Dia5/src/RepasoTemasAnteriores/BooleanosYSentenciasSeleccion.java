package RepasoTemasAnteriores;

import java.util.Scanner;

public class BooleanosYSentenciasSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 4 del tema 3
		//Declaración de variables
		float tasa, horasTrabajadas; //Entrada del programa
		//Datos que tenemos que calcular
		float horasExtra, salarioBruto, salarioNeto, impuesto = 0;
		
		//Solicitar datos al usuario.
		Scanner lector = new Scanner (System.in);
		System.out.println("Introduzca las horas trabajadas");
		horasTrabajadas = lector.nextFloat();
		
		System.out.println("Indica la tasa a la que se pagan las horas trabajadas");
		tasa = lector.nextFloat();
		
		if(horasTrabajadas <=38) {
			salarioBruto = horasTrabajadas * tasa;
		}
		
		else {
			horasExtra = horasTrabajadas - 38;
			float tasaExtra = tasa + tasa*0.5f;
			salarioBruto = 38*tasa + horasExtra*tasaExtra;
			//salarioBruto = 38*tasa + (horasTrabajadas - 38) * (tasa + tasa*0.5f);
			
		}
		
		//Calcular salario neto
		if(salarioBruto<=300) {
			
			salarioNeto = salarioBruto;
		}
		
		else {
			impuesto = salarioBruto*0.1f;
			//salarioNeto = salarioBruto - salarioBruto*0.1f;
		}
		
		salarioNeto = salarioBruto - impuesto;
		
		System.out.println(salarioNeto);
		System.out.println(salarioBruto);
		
	}
}

	    
	
		
		

	



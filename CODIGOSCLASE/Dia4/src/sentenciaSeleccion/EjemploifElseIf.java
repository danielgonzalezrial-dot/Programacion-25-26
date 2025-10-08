package sentenciaSeleccion;

public class EjemploifElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Progrmaa que clasifica un numero como negativo, cero o positivo
		int numero = 0;
		
		if (numero>0) {
			System.out.println("Positivo");
		}
		else if (numero == 0) {
			System.out.println("cero");
		}
		
		//else if (numero < 0)--> no tiene sentido porque si no es las otras dos es esta si o si
		
		else {
			System.out.println("negativo");
			
			
		}

	}

}

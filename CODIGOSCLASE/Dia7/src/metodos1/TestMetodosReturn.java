package metodos1;

public class TestMetodosReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//prueba metodo sumar.
		
		int suma = MetodosReturn.sumar(6, 7);
		
		//Calcular la raiz cuadrada de la suma de dos números
		
		int a = 9;
		int b = 6;
		double raiz = Math.sqrt(MetodosReturn.sumar(a, b));
		
		//Prueba metodo CalcularMaximo
		int maximo = MetodosReturn.calcularMaximo(10, 6, 4);
		
		System.out.println("El máximo es :" + MetodosReturn.calcularMaximo(3, 0, 83));
		
		
		//Prueba metodo buscar en array
		int [] matriz = {4,5,6,7,8,9};
		int posicion = MetodosReturn.buscarEnArray(matriz, 6);
		int posicion2 = MetodosReturn.buscarEnArray(matriz, 1);
		
		//Informo al usuario de si esta el valor o n
		if(posicion == -1) {
			System.out.println("El valor no esta en el array");
		}
		else {
			System.out.println("Esta en la posicion " + posicion2);
		}
				
		
	}

}

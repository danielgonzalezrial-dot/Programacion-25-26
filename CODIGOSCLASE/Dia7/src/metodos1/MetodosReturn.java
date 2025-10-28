package metodos1;

public class MetodosReturn {

	  //Concepto de método (función) -> Algoritmo al que se le pone un nombre con la idea
	  //de poder reutilizarlo
	  //Métodos se identifican univocamente por la firma: nombre, y el tipo y numero de sus argumentos
	
	
	//Método que calcula la suma de dos números (acceso publico)
	
	 public static int sumar(int x, int y) {
		 
		 int suma = x + y;		 
		 return suma;
		 
		 
	 }
	
	 //Método que calcula (devuelve) el mayor de 3 numeros (acceso de paquete)
	 
	 static int calcularMaximo(int a, int b, int c) {
		 
		 //Calcular el mayor entre a y b
		 int mayor = Math.max(a,b);
		 if(c> mayor) {
			 return c;
		 }
		 else {
			 return mayor;
		 }
	 }
		 //Método que busca un valor en un arrayy devuelve la posicion de la primera aparicion
		 //acceso publico
		 
		 public static int buscarEnArray(int[] matriz,int valor){
			 
			 for (int i=0; i<matriz.length; i++) {
				 
				 if (matriz[i] == valor ) {
					 return i;
				 }
			 }
		 return -1;
		 }
}

			 
		 
		
	 
	 


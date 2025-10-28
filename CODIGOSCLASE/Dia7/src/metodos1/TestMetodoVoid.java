package metodos1;

public class TestMetodoVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Llenar un array:
		int[] array = new int[10];
		MetodosVoid.llenarArray(array);
		
		//Llenarlo con valores positivos hasta 50
		MetodosVoid.llenarArray(array, 50);
		
		//llenarlo con valores entre -50 y 50
		MetodosVoid.llenarArray(array, -50, 50);
		
		//Mostrar por pantalla 
		MetodosVoid.mostrarArray(array);
	}

}

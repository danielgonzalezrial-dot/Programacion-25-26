package ejemplosFor;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//POrograma que muestre 8 lineas de 8 asteriscos
	for(int i = 1; i<10;i++) {
		for (int j=1;j<9;j++) {
			System.out.print("* ");
		
		}
		System.out.println();
	}
	
	
	//Programa qeu muestre por pantalla 10 fiolas de asteriscos
//	* * * * * *
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*
	
	
	System.out.println();
	
int limite = 10;
	for(int i = 0; i<10;i++) {
		for (int j=1;j<=limite;j++) {
			System.out.print("* ");
			 		
		}
		limite--;
		System.out.println();
	}
	}
}

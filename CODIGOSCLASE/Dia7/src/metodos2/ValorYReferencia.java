package metodos2;

public class ValorYReferencia {

	
	//Método que intercambia el valor de dos variables: Fallido (No funciona)
      static void intercambia(int x, int y) {
    	  int temp = x;
    	  x = y;
    	  y = temp;
    	  
      }
      
      //Metodo que suma 10 a un número entero
      
      static void sumar10 (int numero) {
    	  numero = numero + 10;
    	  return numero;
      }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b= 9;
		//intercambiar dos variables a y b
		
		intercambia(a,b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//sumar 10
		//a == su
		

	}

}

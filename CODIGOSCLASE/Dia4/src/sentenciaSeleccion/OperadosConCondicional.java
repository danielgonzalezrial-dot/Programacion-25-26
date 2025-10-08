package sentenciaSeleccion;

public class OperadosConCondicional {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String calificacion;
		int nota = 8;
		
		//Calificacion es sispuienso si nota <7 o aporbado si nota >7
		
		/*if (nota <7) {
			calificacion = "suspenso";
			
		}
		else {
			calificacion = "Aprobado";
		*/
		
		calificacion = nota <7 ? "Suspenso" : "Aprobado";
		
		
		

	}

}

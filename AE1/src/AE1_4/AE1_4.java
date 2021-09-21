package AE1_4;

//4. Escribe  el  código  necesario  para  calcular  el  factorial  del  número  15,  en  menos  de  5 
//instrucciones.

public class AE1_4 {

	public static void main(String[] args) {
		
		int numero = 15;
		int factorial = 1;
		
		for(int i=1; i<=numero; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("El factorial de " + numero + " es: " + factorial);

	}

}

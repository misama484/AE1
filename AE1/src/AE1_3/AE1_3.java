package AE1_3;

//3. Escribe  un  m�todo  que  sume  los  n�meros  pares  hasta  el  n�mero  que  acepta  como 
//par�metro y devuelva el resultado de la suma.


public class AE1_3 {

	public static void main(String[] args) {
		
		int numero = 10;
		System.out.println(sumaPares(numero));

	}
	
	public static int sumaPares(int numero) {
		int valor = 0;
		
		for(int i=0; i<numero; i++) {
			
			if(numero %2 == 0) {
				valor = valor + i;
			}
		}
		
		return valor;		
	}

}

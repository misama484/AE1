package AE1_3;

//3. Escribe  un  m�todo  que  sume  los  n�meros  pares  hasta  el  n�mero  que  acepta  como 
//par�metro y devuelva el resultado de la suma.


public class AE1_3 {

	public static void main(String[] args) {
		
		int numero = 6;
		int consola = sumaPares(numero);
		System.out.println(consola);

	}
	
	public static int sumaPares(int num) {
		int valor = 0;
		
		for(int i=0; i<=num; i++) {
			
			if(num %2 == 0) {
				valor += i;
			}
			System.out.println(valor);
		}
		
		return valor;		
	}

}

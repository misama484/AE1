package AE1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8. Escribe un método que pida por teclado 2 números como extremos de un intervalo. Luego 
//imprime por pantalla todos los números entre ese intervalo, indicando junto al número si es 
//un número primo o no. Al terminar de mostrar los números por pantalla, debe mostrar un 
//mensaje indicando el tiempo consumido en la ejecución del método.

public class AE1_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//variables para medir tiempo de ejecucion
		long tInicio;
		long tFin;
		double tiempo;
		
		//iniciamos medicion
		tInicio = System.currentTimeMillis();
		
		
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduzca numero inicial: ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Introduzca segundo numero: ");
		int n2 = Integer.parseInt(br.readLine());
		
		CalculaPrimos(n1, n2);
		
		//almacenamos tiempo al final de la ejecucion
		tFin = System.currentTimeMillis();
		
		//Calculamos el tiempo
		tiempo = tFin - tInicio /1000;
		
		//imprimimos el tiempo de ejecucion
		System.out.println("El tiempo de ejecucion ha sido de: " + tiempo + " segundos.");
		

	}
	
	public static void CalculaPrimos(int n1, int n2) {
		
		for(int i = n1; i<= n2; i++) {
			if(esPrimo(i)) {
				System.out.println(i + " es primo");
			}
			else {
				System.out.println(i + " no es primo");
			}
		}
		
	}
	
    public static boolean esPrimo(int numero) {
    	 
        if (numero <= 1) {
            return false;
        }
 
        int contador = 0;
 
        //bucle que cuenta los numeros divisibles
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
 
        return contador < 1;
    }
    
    
 
}



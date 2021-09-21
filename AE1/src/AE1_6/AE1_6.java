package AE1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//6. Escribe un método que pida 5 números enteros (sin validación de momento), los muestre 
//por consola en orden inverso y devuelva la suma de todos los números proporcionados.

public class AE1_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		OrdenInverso();		
		
	}
	
	//creamos el metodo
	public static void OrdenInverso() throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		List<Integer>arrayNum = new ArrayList<Integer>();
		
		//iteramos para pedir los numeros y agregarlos a la lista
		for(int i = 0; i<5; i++) {
			System.out.println("Introduce un nuemro: ");
			int numero = Integer.parseInt(br.readLine());
			//int numero = (int) (Math.random()*50+1);
			arrayNum.add(numero);
			
		}
		
		//imprimimos los nuemros en el orden de la lista
		System.out.println("Numeros ordenados: ");
		for(int n : arrayNum) {
			
			System.out.println(n);
		}
		
		//aqui invertimos el orden de iteracion para sacarlos en orden inverso
		System.out.println("Numeros en orden inverso: ");
		for(int i = arrayNum.size(); --i >= 0;) {
			int consola = arrayNum.get(i);
			System.out.println(consola);
		}
		
	}

}

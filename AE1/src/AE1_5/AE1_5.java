package AE1_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//5. Escribe  un  método  que  acepte  un  array  o  una  lista  de  elementos y  devuelva  el mayor  de  ellos. 

public class AE1_5 {

	public static void main(String[] args) {
		MayorQue();

	}
	
	public static void MayorQue() {
		//creamos Arraylist para almacenar los numeros
		List<Integer>arrayNum = new ArrayList<Integer>();
		
		//Generamos numero aleatroio con Math.random y lo agregamos al arraylist
		for(int i = 1; i<= 10; i++) {			
		arrayNum.add((int) (Math.random()*50+1));
		
		}
		
		//utilizamos el metodo que nos orndenara de menor a mayor los numeros
		Collections.sort(arrayNum);
		
		//imprimimos por pantalla los valores ordenados
		for(int n : arrayNum) {
			System.out.println(n);
		}
		
		
	}

}

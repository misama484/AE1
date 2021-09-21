package AE1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//7. Escribe  un  método  que  pida  por  teclado  el  nombre  y  los  años  de  experiencia  como 
//desarrollador de software y muestre el nivel y el salario en base al siguiente criterio: 
//a. Si lleva menos de 1 año --> “Desarrollador Junior L1 – 15000-18000” 
//b. Si lleva entre 1 y 2 años --> “Desarrollador Junior L2 – 18000-22000” 
//c. Si lleva entre 3 y 5 años --> ”Desarrollador Senior L1 – 22000-28000” 
//d. Si lleva entre 5 y 8 años --> “Desarrollador Senior L2 – 28000-36000”
//e. Si lleva más de 8 años --> “Analista / Arquitecto. Salario a convenir en base a rol”

public class AE1_7 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduzca su nombre: ");
		String nombre = br.readLine();
		
		System.out.println("Introduzca los anyos trabajados como Software Developer: ");
		int anyos = Integer.parseInt(br.readLine());
		
		
		
		System.out.println("Hola " + nombre + ", segun tu experiencia laboral, tu nivel y salario es: ");
		System.out.println(CalculaSalario(anyos));

	}
	
	public static String CalculaSalario(int anyos) throws IOException {
		
		String mensaje;
	
		if(anyos <=1) {
			mensaje = "Desarrollador Junior L1 – 15000-18000";
		}
		else if(anyos>1 && anyos<=2) {
			mensaje = "Desarrollador Junior L2 – 18000-22000";
		}
		else if(anyos>2 && anyos<=5) {
			mensaje = "Desarrollador Senior L1 – 22000-28000";			
		}
		else if(anyos>5 && anyos<=8) {
			mensaje = "Desarrollador Senior L2 – 28000-36000";			
		}
		else {
			mensaje = "Analista / Arquitecto. Salario a convenir en base a rol";			
		}
		
		return mensaje;
		
	}

}

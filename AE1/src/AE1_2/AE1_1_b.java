package AE1_2;

import java.util.ArrayList;
import java.util.List;

//2. Crea un array de elementos que contenga el nombre de 6 compañeros de clase y... 
//a. Haz que se escriban por la consola en líneas consecutivas. 
//b. Haz lo mismo, pero empleando un objeto de tipo lista. 


public class AE1_1_b {

	public static void main(String[] args) {

		List<String> companyeros = new ArrayList<String>();
		
		companyeros.add("Pedro");
		companyeros.add("Maria");
		companyeros.add("Juan");
		companyeros.add("Miguel");
		companyeros.add("Paula");
		companyeros.add("Pepe");
		
		for(String c : companyeros) {
			System.out.println(c + " ");
		}

	}

}

package AE1_1;

//1. Crea una aplicaci�n de consola en la se utilice una clase que tenga un m�todo �sayHello� 
//que saque por consola �Hola Mundo�. La clase puede tener el nombre que consideres. Como 
//sugerencia, la clase se puede llamar �App�.

public class App {

	public static void main(String[] args) {
		System.out.println(sayHello());
	}
	
	
	public static String sayHello() {
		String saludo = "Hola Mundo";
		return saludo;
	}
}
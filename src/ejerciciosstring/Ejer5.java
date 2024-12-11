package ejerciciosstring;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// String para guardar temporalmente las palabras
		String word = "";
		
		// String para guardar la frase
		String phrase = "";
		
		// Pedimos una palabra
		System.out.print("Introduce una palabra: ");
		word = reader.nextLine();
		
		// Bucle que se repetirá mientras la palabra introducida sea distinta de "fin"
		while (!word.toLowerCase().equals("fin")) {
			// Añadimos la palabra con un espacio a la frase
			phrase += word + " ";
			
			// Pedimos otra palabra
			System.out.print("Introduce una palabra: ");
			word = reader.nextLine();
		}
		
		// Imprimimos la frase
		System.out.println(phrase);
		
		// Cerramos el Scanner
		reader.close();

	}

}

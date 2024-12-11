package ejerciciosstring;

import java.util.*;

public class Ejer4 {
	
	// Función para invertir la frase
	static String invertPhrase(String phrase) {
		// Declaro un String para guardar en el la frase invertida
		String invertedPhrase = "";
		
		// For para ir guardando desde el final la frase
		for (int i = phrase.length() - 1; i >= 0; i--) {
			invertedPhrase += phrase.charAt(i);
		}
		
		// Devolvemos la frase
		return invertedPhrase;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Pedimos una frase
		System.out.print("Introduce una frase: ");
		
		// Imprimimos la frase con la función
		System.out.print(invertPhrase(reader.nextLine()));
		
		// Cerramos el Scanner
		reader.close();
	}

}

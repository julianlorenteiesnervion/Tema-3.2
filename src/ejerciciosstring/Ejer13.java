package ejerciciosstring;

import java.util.*;

public class Ejer13 {
	
	// Función para detectar anagramas
	static boolean anagrama(String word1, String word2) {
		boolean anagrama = false;
		
		// Convertimos en arrays char las palabras
		char[] arrayWord1 = word1.toCharArray();
		char[] arrayWord2 = word2.toCharArray();
		
		// Ordenamos alfabéticamente las palabras
		Arrays.sort(arrayWord1);
		Arrays.sort(arrayWord2);
		
		/* Si son iguales después de haber sido ordenadas,
		 * significa que las palabras son anagramas */
		if (Arrays.equals(arrayWord1, arrayWord2))
			anagrama = true;
		
		// Devolvemos el valor booleano
		return anagrama;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaramos los strings
		String word1;
		String word2;
		
		// Pedimos las dos palabras
		System.out.print("Introduce la primera palabra: ");
		word1 = reader.next();
		
		System.out.print("Introduce la segunda palabra: ");
		word2 = reader.next();
		
		// Imprimimos si es o no un anagrama
		System.out.print("Las palabras " + (anagrama(word1, word2) ? "" : "no ") + "son anagramas.");
		

	}

}

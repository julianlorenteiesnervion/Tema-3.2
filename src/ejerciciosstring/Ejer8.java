package ejerciciosstring;

import java.util.Arrays;

public class Ejer8 {
	
	// Función para ordenar alfabéticamente una frase
	static String[] stringToAbc(String phrase) {
		// Array en el que guardamos todas las palabras de la frase
		String orderedPhrase[] = phrase.split(" ");
		
		// Ordenamos las palabras alfabéticamente
		Arrays.sort(orderedPhrase);
		
		// Devolvemos la frase ordenada
		return orderedPhrase;
	}

	public static void main(String[] args) {
		// Frase desordenada
		String phrase = "Bolos Agua Comer Cenar";
		
		// Imprimimos el resultado de la función
		System.out.print(Arrays.toString(stringToAbc(phrase)));
	}

}

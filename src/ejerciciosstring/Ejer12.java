package ejerciciosstring;

public class Ejer12 {
	
	// Función para imprimir la palabra más larga de un String
	static void printLongestWord(String phrase) {
		// Separamos las palabras en un array
		String[] words = phrase.split(" ");
		
		// Guardamos la primera palabra como la palabra más larga
		String longestWord = words[0];
		
		/* Bucle para comprobar si la palabra
		 * correspondiente es más larga que la
		 * palabra más larga */
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longestWord.length())
				longestWord = words[i];
		}
		
		// Imprimimos la palabra y su longitud
		System.out.println(longestWord);
		System.out.print(longestWord.length());
	}

	public static void main(String[] args) {
		// Frase
		String phrase = "Hola que tal";
		
		// Usamos la función
		printLongestWord(phrase);
	}

}

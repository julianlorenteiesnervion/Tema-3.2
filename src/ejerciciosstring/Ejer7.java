package ejerciciosstring;

import java.util.*;

public class Ejer7 {
	
	// Función para buscar la palabra en la frase
	static int wordSearchCounter(String phrase, String word) {
		// Contador para guardar el número de palabras encontradas
		int counter = 0;
		
		/* Guardar temporalmente la posición
		 * de la última palabra encontrada */
		int pos = 0;
		
		// Buscamos la palabra
		pos = phrase.indexOf(word);
		
		/* Si no la ha encontrado, no haremos más
		 * busquedas ya que pos valdrá -1 */
		while (pos != -1) {
			// Incrementamos el contador
			counter++;
			/* Pos valdrá la posición donde encontramos
			 * la palabra por última vez más 1 */
			pos = phrase.indexOf(word, pos+1);
		}
		
		// Devolvemos el contador
		return counter;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Strings para la frase y la palabra
		String phrase;
		String word;
		
		// Pedimos la frase
		System.out.print("Introduce una frase: ");
		phrase = reader.nextLine();
		
		// Pedimos la palabra
		System.out.print("Introduce una palabra: ");
		word = reader.nextLine();
		
		// Cerramos el Scanner
		reader.close();
		
		// Imprimimos el número de veces que se ha encontrado la palabra
		System.out.print(wordSearchCounter(phrase, word));
	}

}

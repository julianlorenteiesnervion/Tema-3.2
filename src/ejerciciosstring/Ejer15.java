package ejerciciosstring;

import java.util.*;

public class Ejer15 {
	// Método random
	static Random random = new Random();

	// Función para alterar aleatoriamente el orden de los caracteres en un string
	static char[] randomOrder(String phrase) {
		// Nos guardamos en un array de char's la frase
		char[] randomizedPhrase = new char[phrase.length()];
		randomizedPhrase = phrase.toCharArray();
		
		// Char auxiliar que necesitaremos para realizar el cambio de posición de los caracteres
		char aux;
		// Entero en el que generaremos posiciones aleatorias
		int randomPos;
		
		/* Do-while para realizar el cambio de posiciones de los caracteres.
		 * Es un bucle ya que existe la posibilidad de que nos genere aleatoriamente
		 * exactamente la misma frase que existía originalmente,
		 * por lo que este bucle se repetirá mientras la frase aleatoria
		 * sea igual a la frase original */
		do {
			for (int i = 0; i < phrase.length(); i++) {
				randomPos = random.nextInt(0, phrase.length()); // Posición aleatoria
				
				// Realizamos el cambio
				aux = randomizedPhrase[randomPos];
				randomizedPhrase[randomPos] = randomizedPhrase[i];
				randomizedPhrase[i] = aux;
			}
		} while (randomizedPhrase.toString().equals(phrase));
		
		// Devolvemos la frase aleatoria
		return randomizedPhrase;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// String para guardar la frase
		String phrase;
		
		// String para guardar el intento de acierto de la frase
		String attempt;
		
		// Pedimos una palabra o frase, que no debe estar vacía
		do {
			System.out.print("Jugador 1, introduce una palabra o frase: ");
			phrase = reader.nextLine();
		} while (phrase.equals(""));
		
		// Imprimimos la frase con el orden alterado
		System.out.println(randomOrder(phrase));
		
		// Solicitamos un intento de acierto
		System.out.print("Jugador 2, intenta acertar la palabra o frase: ");
		attempt = reader.nextLine();
		
		// Mientras el intento sea distinto a la frase original, volvemos a solicitar otro intento
		while (!attempt.equals(phrase)) {
			System.out.print("Inténtalo otra vez: ");
			attempt = reader.nextLine();
		}
		
		// Si nos salimos del bucle, significará que hemos acertado la frase
		System.out.print("¡Has acertado la frase!");
		
		// Cierre del scanner
		reader.close();
	}

}

package ejerciciosstring;

import java.util.*;

public class Ej14 {
	
	// Función para imprimir el contador de letras
	static void printWordCount(String phrase) {
		// Contador
		int counter = 0;
		
		// For para recorrer el abecedario
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			// For para recorrer toda la frase en busca de la letra correspondiente
			for (int i = 0; i < phrase.length(); i++) {
				// Si encontramos la letra, incrementamos el contador
				if (phrase.charAt(i) == letter)
					counter++;
			}
			// Si el contador es igual a 0, imprimimos el número de veces que se ha encontrado la letra
			if (counter != 0)
				System.out.println(letter + ": " + counter + (counter == 1 ? " vez" : " veces"));
			
			counter = 0;
		}
		
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la frase
		String phrase;
		
		// Le preguntamos al usuario la frase
		System.out.print("Escribe una frase: ");
		/* La guardamos en letras mayúsculas para que se
		 * cuenten las letras independientemente de si están
		 * en mayúsculas o minúsculas */
		phrase = reader.nextLine().toUpperCase();
		
		reader.close(); // Cerramos el Scanner
		
		// Ejecutamos la función
		printWordCount(phrase);

	}

}

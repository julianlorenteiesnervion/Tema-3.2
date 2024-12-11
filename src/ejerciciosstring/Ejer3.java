package ejerciciosstring;

import java.util.*;

public class Ejer3 {
	
	// Función para contar los espacios
	static int spacesCount(String phrase) {
		// Contador de espacios
		int count = 0;
		
		// For para recorrer toda la frase
		for (int i = 0; i < phrase.length(); i++) {
			// Si encontramos un espacio, incrementamos el contador
			if (phrase.charAt(i) == ' ')
				count++;
		}
		
		// Devolvemos el contador
		return count;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Pedimos una frase
		System.out.print("Introduce una frase: ");
		
		// Printeamos la función
		System.out.print("Hay " + spacesCount(reader.nextLine()) + " espacios en blanco en esta frase.");
		
		reader.close();
	}

}

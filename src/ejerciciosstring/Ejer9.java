package ejerciciosstring;

import java.util.*;

public class Ejer9 {
	
	// Función para detectar el dialecto y traducir la frase en caso de que se encuentre un dialecto
	static boolean translator(String phrase) {
		// Booleana para guardar si se ha encontrado un dialecto
		boolean isJavalandia = false;
		
		// Si empieza por Javalín, javalón, devolvemos true e imprimimos la frase sin las muletillas
		if (phrase.startsWith("Javalín, javalón")) {
			isJavalandia = true;
			System.out.println(phrase.substring(16).trim());
		// Si termina por javalén, len, len, devolvemos true e imprimimos la frase sin las muletillas
		} else if (phrase.endsWith("javalén, len, len")) {
			isJavalandia = true;
			System.out.println(phrase.substring(0, phrase.length() - 17).trim());
		}
		
		// Devolvemos el booleano
		return isJavalandia;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// String para la frase
		String phrase;
		
		// Pedimos y guardamos la frase
		System.out.print("Introduce una frase: ");
		phrase = reader.nextLine();
		
		// Cerramos el Scanner
		reader.close();
		
		// Imprimimos true / false
		System.out.print(translator(phrase));
	}

}

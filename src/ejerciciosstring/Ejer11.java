package ejerciciosstring;

import java.util.*;

public class Ejer11 {
	
	// Función para descodificar la palabra recibida
	static char descodifica(char conjunto1[], char conjunto2[], char c) {
		/* Booleano que se mantendrá en false
		 * mientras el carácter no haya sido
		 * encontrado en el array */
		boolean found = false;
		
		/* Bucle para recorrer todo el array
		 * mientras estemos dentro de la longitud
		 * del array o hayamos encontrado la letra */
		int i = 0;
		while (i < conjunto1.length && !found) {
			if (Character.toLowerCase(c) == conjunto1[i]) {
				c = conjunto2[i];
				found = true;
			}
			
			i++;
		}
		
		// Devolvemos el carácter
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// String para la palabra que nos introducirá el usuario
		String word = "";
		
		// String para guardar la palabra descodificada
		String decodedWord = "";
		
		// Arrays con los conjuntos
		char[] cj1 = new char[] {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		char[] cj2 = new char[] {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		
		// Pedimos la palabra
		System.out.print("Introduce una palabra: ");
		word = sc.nextLine();
		
		// Bucle para sustituir las letras con la función
		for (int i = 0; i < word.length(); i++) {
			decodedWord += descodifica(cj1, cj2, word.charAt(i));
		}
		
		System.out.print(decodedWord);
	}

}

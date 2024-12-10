package ejerciciosstring;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Declaramos el método scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos los dos strings para las dos frases
		String frase1;
		String frase2;
		
		// Solicitamos ambas frases
		System.out.print("Introduce una frase: ");
		frase1 = reader.nextLine();
		
		System.out.print("Introduce otra frase: ");
		frase2 = reader.nextLine();
		
		reader.close(); // Cerramos el scanner
		
		/* Si la longitud de la frase 1 es superior
		 * a la de la frase 2, la frase 2 es más corta */
		if (frase1.length() > frase2.length())
			System.out.print("La frase 2 es más corta.");
		// Si es menor, la frase 1 es más corta
		else if (frase1.length() < frase2.length())
			System.out.print("La frase 1 es más corta.");
		// Si son iguales, pues se imprime que son iguales
		else
			System.out.print("Las frases son iguales.");

	}

}

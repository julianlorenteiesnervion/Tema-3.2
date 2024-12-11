package ejerciciosstring;

import java.util.*;

public class Ejer2Avanzado {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// String para guardar la contraseña
		String password;
		
		// String para guardar el intento de acertar la contraseña
		String passwordTry;
		
		// Array para ir actualizando los intentos acertados del usuario y mostrarlos
		char[] pswd;
		
		// Pedimos y guardamos la contraseña
		System.out.print("Jugador 1, introduce la contraseña: ");
		password = reader.nextLine();
		
		// Le ponemos al array la longitud de la contraseña
		pswd = new char[password.length()];
		
		// Rellenamos el array pswd con asteriscos
		Arrays.fill(pswd, '*');
		
		// Bucle Do-While
		do {
			// Intento
			System.out.print("Jugador 2, adivina la contraseña: ");
			passwordTry = reader.nextLine();
			
			/* Comparamos el intento de contraseña con la contraseña real, sustituyendo
			 * en el array pswd los asteriscos por las letras correspondientes que se hayan
			 * acertado */
			for (int i = 0; i < pswd.length; i++) {
				if (passwordTry.charAt(i) == password.charAt(i))
					pswd[i] = passwordTry.charAt(i);
			}
			
			// Imprimimos el array
			System.out.println(Arrays.toString(pswd));
		} while (!password.equals(passwordTry)); // Mientras el intento sea desigual a la contraseña
		
		reader.close(); // Cerramos el Scanner
		
		System.out.print("Has acertado la contraseña.");
	}

}

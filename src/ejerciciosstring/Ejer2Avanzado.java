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
		
		for (int i = 0; i < password.length(); i++) {
			pswd[i] = password.charAt(i);
		}
		
		// Bucle Do-While
		do {
			// Intento
			System.out.print("Jugador 2, adivina la contraseña: ");
			passwordTry = reader.nextLine();
			
			
		} while (!password.equals(passwordTry)); // Mientras el intento sea desigual a la contraseña
		
		reader.close(); // Cerramos el Scanner
	}

}

package ejerciciosstring;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// String para guardar la contraseña
		String password;
		
		// String para guardar el intento de acertar la contraseña
		String passwordTry;
		
		// Pedimos y guardamos la contraseña
		System.out.print("Jugador 1, introduce la contraseña: ");
		password = reader.nextLine();
		
		// Bucle Do-While
		do {
			// Intento
			System.out.print("Jugador 2, adivina la contraseña: ");
			passwordTry = reader.nextLine();
			
			/* Si comparamos el intento con la contraseña
			y obtenemos un valor positivo, significa que la contraseña es menor */
			if (passwordTry.compareTo(password) > 0)
				System.out.println("La contraseña es menor alfabéticamente.");
			// Igual que antes pero al revés
			else if (passwordTry.compareTo(password) < 0)
				System.out.println("La contraseña es mayor alfabéticamente.");
			/* Si no se ha cumplido ninguna de las dos condiciones
			 * anteriores, significa que se ha acertado la contraseña */
			else
				System.out.println("¡Has acertado la contraseña!");
		} while (!password.equals(passwordTry)); // Mientras el intento sea desigual a la contraseña
		
		reader.close(); // Cerramos el Scanner
	}

}

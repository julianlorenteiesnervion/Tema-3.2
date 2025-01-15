package ejerciciosstring;

import java.util.*;

public class Ejer15 {
	static Random random = new Random();

	static char[] randomOrder(String phrase) {
		char[] randomizedPhrase = new char[phrase.length()];
		randomizedPhrase = phrase.toCharArray();
		
		char aux;
		int randomPos;
		
		do {
			for (int i = 0; i < phrase.length(); i++) {
				randomPos = random.nextInt(0, phrase.length());
				
				aux = randomizedPhrase[randomPos];
				randomizedPhrase[randomPos] = randomizedPhrase[i];
				randomizedPhrase[i] = aux;
			}
		} while (randomizedPhrase.toString().equals(phrase));
		
		return randomizedPhrase;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String phrase;
		String attempt;
		
		do {
			System.out.print("Jugador 1, introduce una palabra o frase: ");
			phrase = reader.nextLine();
		} while (phrase.equals(""));
		
		System.out.print(randomOrder(phrase));
		

	}

}

package englishexercises;

import java.util.*;

public class Exer3 {

	static void printSecretWord(char[] word) {
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + " ");
		}
		System.out.println();
	}

	static char[] checkLetters(char letter, String word, char[] secretWord) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				secretWord[i] = letter;
			}
		}
		return secretWord;
	}

	public static void main(String[] args) {
		String[] words = { "POTATO", "TOMATO", "LETTUCE", "ORANGE", "CODING", "STRAWBERRY" };

		Random random = new Random();
		Scanner reader = new Scanner(System.in);

		String randomWord = words[random.nextInt(0, 6)];

		char[] secretWord = new char[randomWord.length()];

		Arrays.fill(secretWord, '_');

		char[] secretWordBackUp = secretWord.clone();

		printSecretWord(secretWord);

		int userAttempts = 0;

		char letter;

		do {
			System.out.print("Type a letter: ");

			letter = reader.next().charAt(0);
			
			secretWord = checkLetters(letter, randomWord, secretWordBackUp);
			
			printSecretWord(secretWord);

			if(!randomWord.contains(String.valueOf(letter)))
				userAttempts++;

		} while (!secretWord.equals(secretWordBackUp) && userAttempts < 7);
		
		
		
		System.out.println("Game over");

	}

}

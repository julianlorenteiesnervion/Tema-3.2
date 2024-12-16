package ejerciciosstring;

import java.util.*;

public class Ejer9 {
	
	static boolean translator(String phrase) {
		boolean isJavalandia = false;
		
		if (phrase.startsWith("Javalín, javalón")) {
			isJavalandia = true;
			System.out.print(phrase.trim());
		} else if (phrase.endsWith("javalén, len, len")) {
			isJavalandia = true;
		}
		
		return isJavalandia;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String phrase;
		
		System.out.print("Introduce una frase: ");
		phrase = reader.nextLine();
		
		reader.close();
		
		System.out.print(translator(phrase));
		

	}

}

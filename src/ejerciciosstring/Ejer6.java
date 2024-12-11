package ejerciciosstring;

public class Ejer6 {
	
	// Función para comprobar si una frase es palíndroma
	static boolean palindroma(String phrase) {
		// Inicializamos la booleana a false
		boolean palindroma = false;
		
		// Guardamos en un String la frase sin espacios con un replace
		String noSpacePhrase = phrase.replace(" ", "");
		
		// Declaramos un String para guardar la frase invertida
		String invertedPhrase = "";
		
		// Invertimos la frase
		for (int i = noSpacePhrase.length() - 1; i >= 0; i--) {
			invertedPhrase += noSpacePhrase.charAt(i);
		}
		
		/* Si la frase invertida es igual a la frase original
		 * (ambas sin espacios), devolvemos true */
		if (noSpacePhrase.equalsIgnoreCase(invertedPhrase))
			palindroma = true;
		
		// Devolvemos el booleano
		return palindroma;
	}

	public static void main(String[] args) {
		// Frase palíndroma
		String phrase = "Dabale arroz a la zorra el abad";
		
		// Imprimimos si la frase es palíndroma o no
		System.out.print("La frase " + (palindroma(phrase) ? "es " : "no es ") + "palíndroma.");
	}

}

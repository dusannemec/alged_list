import java.util.Arrays;

public class VetorZA {
	public static void main(String [] args) {
		char[] abc = new char[26];

		int caracter = 65;
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) caracter;
			caracter++;
		}

		char anterior, atual;
		for (int i = 0; i < abc.length; i++) {
			if (i % 2 != 0) {
				anterior = abc[i-1];
				atual = abc[i];
				abc[i-1] = atual;
				abc[i] = anterior;
			}
		}

		System.out.println(Arrays.toString(abc));
	}
}

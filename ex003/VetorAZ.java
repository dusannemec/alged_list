import java.util.Arrays;

public class VetorAZ {
	public static void main(String [] args) {
		char[] abc = new char[26];

		int caracter = 65;
		for (int i = 0; i < abc.length; i++) {
			abc[i] = (char) caracter;
			caracter++;
		}

		System.out.println(Arrays.toString(abc));
	}
}

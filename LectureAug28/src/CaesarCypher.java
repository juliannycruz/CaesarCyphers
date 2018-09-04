
public class CaesarCypher {

	private int key;

	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static String shiftedAlphabet;

	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}

	public String encode(String clearText) {
		String cypherText = "";
		clearText = clearText.toUpperCase();
		for (int i = 0; i < clearText.length(); i++) {
			if (Character.isAlphabetic(clearText.charAt(i))) {
				cypherText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
			} else
				cypherText += clearText.charAt(i);
		}
		return cypherText;
	}

	public String decode(String encodedText) {
		String cypherText = "";
		encodedText = encodedText.toUpperCase();
		for (int i = 0; i < encodedText.length(); i++) {
			if (Character.isAlphabetic(encodedText.charAt(i))) {
				cypherText += alphabet.charAt(shiftedAlphabet.indexOf(encodedText.charAt(i)));
			} else
				cypherText += encodedText.charAt(i);
		}
		return cypherText;
	}

}

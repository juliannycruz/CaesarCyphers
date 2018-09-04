
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
		for (int i = 0; i < clearText.length(); i++) {
			if (Character.isAlphabetic(clearText.charAt(i))) {
				cypherText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
			} else
				cypherText += clearText.charAt(i);
		}
		return cypherText;
	}

}


public class Main {

	public static void main(String[] args) {
		
		String name = "Fernando hola";
		CaesarCypher cypher = new CaesarCypher(4);
		name = cypher.encode(name);
		System.out.println(name);
		
	}
	
}

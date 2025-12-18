import java.util.Random;

public class Lettres {
	
	
	// les lettres randomisées :
	String RandomL() {
		
		
			Random r = new Random();
			char c = (char)(r.nextInt(26) + 'A');
			return Character.toString(c);
			
		}
	
	
	// les chiffres randomisées 
	int RandomCH(int min, int max) {
			
			return min + (int)(Math.random() * ((max - min) + 1));
			
		}

}

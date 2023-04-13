package Inverted;

public class Inverted_words {
	public String inverter(String X) {
		
		StringBuilder R =  new StringBuilder(X);
	
		R.reverse();
		String Inverted = R.toString();
		return Inverted;
		}

}

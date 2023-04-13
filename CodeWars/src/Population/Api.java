package Population;

public class Api {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int anos = 0;
		double i;
		for (i = p0; i <= p; i = i + ((i * (percent/100))+ aug)) {
			anos++;

		}
		return anos;
	}

}

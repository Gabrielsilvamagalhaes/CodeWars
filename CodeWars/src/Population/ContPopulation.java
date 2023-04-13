package Population;

import java.util.Scanner;

public class ContPopulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("The numbers of habitants");
		int p0 = sc.nextInt();
		System.out.println("The percentual ");
		double perc = sc.nextDouble();
		System.out.println("Increase in population per year");
		int aumt = sc.nextInt();
		System.out.println("Habitantes esperados");
		int espe = sc.nextInt();
		Api user = new Api();
		
		System.out.println( user.nbYear(p0, perc, aumt, espe) );
		
		
		
	}

}

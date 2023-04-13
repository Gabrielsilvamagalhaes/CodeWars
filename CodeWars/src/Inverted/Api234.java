package Inverted;

import java.util.Scanner;

public class Api234 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int cont=0;
			do {
			System.out.println("Enter word ");
			String word = sc.nextLine();
			
			Inverted_words user = new Inverted_words();
			System.out.println("Inverted: "+ user.inverter(word));
			
			System.out.println("Repeat the program? (1)Yes or (2)No");
			cont = sc.nextInt();
			sc.nextLine();
			}while(cont==1);
	}

}

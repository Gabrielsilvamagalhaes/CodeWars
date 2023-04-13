package Binary;

import java.util.*;

public class APis {
	public static void main(String[] args) {
		One_Zero user = new One_Zero();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> binariosg = new ArrayList<Integer>();
		int Quant;
		do {
			System.out.println("Inform the quantify of numbers(1 or 0): ");
			Quant = sc.nextInt();
			sc.nextLine();
		} while (Quant <= 0);
		for (int i = 0; i < Quant; i++) {
			System.out.println("Inform the " + (i + 1) + "° elemt of array: ");
			int Elements = sc.nextInt();
			binariosg.add(Elements);
		}
		System.out.println(user.BinaryConvert(binariosg));

	}

}

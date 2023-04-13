package MidWords;
import java.util.*;
public class Api {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DisplayMidWords user = new DisplayMidWords();
		System.out.println("Enter the word: ");
		String words = sc.nextLine();
		
		System.out.println(user.numbermid(words));
		
		
	}

}

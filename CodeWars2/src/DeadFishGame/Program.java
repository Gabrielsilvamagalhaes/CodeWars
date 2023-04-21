package DeadFishGame;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeadFish user = new DeadFish();
        
        System.out.println("Enter the deadfish commands");
        String DeadWord = sc.nextLine();
        
        System.out.println("Deadresult: "+Arrays.toString(user.parse(DeadWord)));
        
        sc.close();
    }
}

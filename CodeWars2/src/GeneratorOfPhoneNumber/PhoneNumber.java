package GeneratorOfPhoneNumber;
import java.util.Scanner;

public class PhoneNumber {
    public String CreatePhoneNumber(int [] Numbers){
        String result = new String() ;
        result ="";
        
        for (int i = 0; i < Numbers.length; i++) {
            if (i == 0) {
                result += "(" + Numbers[i];
            } else if (i == 2) {
                result += Numbers[i] + ") ";
            } else if (i == 5) {
                result += Numbers[i] + "-";
            } else if (i <= 9) {
                result += Numbers[i];
            }
        }
        return result;
                
                
        }
            
    
    public static void main(String[] args) {
        PhoneNumber user = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        int [] x =  new int [10];
        for(int i =0; i<x.length; i++){
            System.out.print("Inform the "+(i+1)+"° number: ");
            x[i] = sc.nextInt();
        }
        System.out.println(user.CreatePhoneNumber(x));
        sc.close();
    
    }
    
}

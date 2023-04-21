package GeneratorOfPhoneNumber;
import java.util.Scanner;

public class Droot{
    public int digital_root(int n){
        String n1 = Integer.toString(n);
        int result;
        int result2=0;
        int result3 =0;
            result=0;
            if(n1.length()>=2){

                for(int i =0 ; i<n1.length(); i++){
                    char n2 = n1.charAt(i);
                    result +=  Character.getNumericValue(n2);
                    
                }
            }
        
            result2 =result;
            String n3 = Integer.toString(result2);
            result=0;
            for(int i =0 ; i<n3.length(); i++){
                char n2 = n3.charAt(i);
                result +=  Character.getNumericValue(n2);
                
            }
            result3 = result;
            String n4 = Integer.toString(result3);
            result=0;
            for(int i =0 ; i<n4.length(); i++){
                char n2 = n4.charAt(i);
                result +=  Character.getNumericValue(n2);
                
            }


            
        return result;
    }
    public static void main(String[] args) {
        Droot user = new Droot();
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        System.out.println(user.digital_root(x));
        sc.close();
    
    }
}
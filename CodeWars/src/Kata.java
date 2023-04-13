import java.util.Scanner;

public class Kata{

    public int findEvenIndex(int [] arr){

        int SumLeft, SumRight;
        
        for(int i =0; i<arr.length; i++){

            SumRight = 0;
            SumLeft = 0;
            
            for(int k =i+1; k<arr.length; k++ ){

                SumRight += arr[k]; 
            }
            
            for(int j=0;j<i;j++){

                SumLeft += arr[j];
            }
            
            if(SumRight == SumLeft){

                return i;
            }
            
        }
            
        return -1;
    }
        
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Kata user = new Kata();
        System.out.println("Enter length of array: ");
        int tam = sc.nextInt();
        int [] x = new int[tam];
        System.out.println("Enter array: ");
        for(int i =0 ; i<x.length; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("The index: "+user.findEvenIndex(x));
        sc.close();
    }
    
    
} 

  


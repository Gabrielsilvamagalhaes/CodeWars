package DiceGames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greed {
    public int greedy(int [] dice){
        int result=0, k=0;
        ArrayList<Integer> Core = new ArrayList<>();
        int [] resultum = new int [3];
        
        for(int elements : dice){
            Core.add(elements);
        }
        Collections.sort(Core);

        for(int x : Core){
            k=Collections.frequency(Core, x);
            if(x==2&&k==3){
                    resultum[1]=(200);
            }else if(x==3&&k==3){
                    resultum[1]=(300);
            }else if(x==4&&k==3){
                    resultum[1]=(400);
            }else if(x==6&&k==3){
                resultum[1]=600;
            } 

            if(x==5){
                if(k>3){
                    resultum[2]=(500+ ((k-3)*50)); 
                }else if(k==3){
                    resultum[2]=(500);
                }else if(k==2 | k==1){
                    resultum[2]=(k*50);
                }else{
                    resultum[2]=(0);
                }
            }
            
            if(x==1){
                if(k>3){
                    resultum[0]=(1000+ ((k-3)*100)); 
                }else if(k==3){
                    resultum[0]=1000;
                }else if(k==2|k==1){
                    resultum[0]=k*100;
                }else{
                    resultum[0]=0;
                }
            }
        }
        
        for(int i =0; i<resultum.length; i++){
            result+=resultum[i];
        }
        return result;
        
    }
    public static void main(String[] args) {
        Greed user = new Greed();
        Scanner sc = new Scanner(System.in);
        int [] x = new int[5];
        System.out.println("Inform the numbers: ");
        for(int i =0; i<x.length; i++){
            x[i] = sc.nextInt();
        }
        System.out.println(user.greedy(x));
        sc.close();
    
    
    
    }
    
}

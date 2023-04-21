package DeadFishGame;
import java.util.ArrayList;

public class DeadFish {
    
    public int[] parse(String data){
        int value = 0, j = 0;
        ArrayList<Integer> x = new ArrayList<>();
        int[] x1;

        for (int i = 0; i < data.length(); i++) {
            char Command = data.charAt(i);
            if (Command == 'i' || Command == 'I') {
                value = value + 1;

            } else if (Command == 'd' || Command == 'D') {
                value = value - 1;
            } else if (Command == 's' || Command == 'S') {
                value = (int) Math.pow(value, 2);
            } else if (Command == 'o' || Command == 'O') {
                x.add(j, value);
                j++;
            }

        }
        if (x.isEmpty()) {
            x1 = new int[0];
        } else {
            x1 = new int[x.size()];

            for (int i = 0; i < x.size(); i++) {
                x1[i] = x.get(i);
            }
        }
        return x1;       
    }
   
    
}

package Binary;
import java.util.*;
public class One_Zero {
	
	public int BinaryConvert(List<Integer> Binario) {
		int result =0;
		int exp = Binario.size() -1;
		for(int i =0; i<Binario.size(); i++) {
		result+= Binario.get(i)*Math.pow(2, exp);
		exp--;
		}
		return result;
		
	}

}

package MidWords;

import java.util.ArrayList;
import java.util.List;

public class DisplayMidWords {
	public char value1, value3;
	public String value2, value4;

	public List<String> numbermid(String word) {
		List<String> resultado = new ArrayList<>();
		
		int x = word.length();
		int y;
		if (x % 2 != 0) {
			y = x / 2 + 1;
			value1 = word.charAt(y - 1);
			value2 = String.valueOf(value1);
			resultado.add(value2);
			return resultado;
		} else {
			y = x / 2;
			value3 = word.charAt(y - 1);
			value1 = word.charAt(y);
			value4 = String.valueOf(value3);
			value2 = String.valueOf(value1);
			resultado.add(value4);
			resultado.add(value2);
			return resultado;
		}
			
	}

}

package Triangule;

public class isTriangule {
	public static boolean triangule(int a, int b, int c) {
		if(a>Math.abs(b-c)) {
			if(a<b+c) {
				return true;
			}
		}else {
			return false;
		}
		
		if(b>Math.abs(a-c)) {
			if(b<a+c) {
				return true;
			}
		}else {
			return false;
		}
		if(c>Math.abs(b-a)) {
			if(c<b+a) {
				return true;
			}
		}else
		return false;
		return false;
	
	}
	public static void main(String[] args) {
		System.out.println(triangule(7,2,2));
	}

}

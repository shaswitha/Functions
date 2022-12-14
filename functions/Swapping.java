package functions;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		SwappingFunction(a,b);
		

	}
	public static void SwappingFunction(int a, int b) {
		System.out.println("Before swapping, a = " + a + "  " + "b = " + b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping, a= "+ a +  "  " + " b = " + b);
	}

}

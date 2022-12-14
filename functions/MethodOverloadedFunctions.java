package functions;

public class MethodOverloadedFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;

		int r = 5;

		MethodOverloadedFunctions Obj = new MethodOverloadedFunctions();

		float area_circle = Obj.area(r);
		int area_rectangle = Obj.area(x, y);
		System.out.println("Area of the Circle is :- "+area_circle);
		System.out.println("Area of the Rectangle is :- "+area_rectangle);
	}

	public int area(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public float area(int n) {
		float result = 3.14f * n * n;
		return result;
	}

}

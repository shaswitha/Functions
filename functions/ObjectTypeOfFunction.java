package functions;

public class ObjectTypeOfFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectTypeOfFunction Obj = new ObjectTypeOfFunction();
		
		int x=10;
		int y=20;
		
		int get_result = Obj.add(x, y);
		System.out.println(get_result);
	

	}
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

}

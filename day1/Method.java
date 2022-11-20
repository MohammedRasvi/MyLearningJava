package day1;

public class Method {

	public void demo() {
	int num1 = 7;
	int num2 = 4;
	int num3 = num1+num2;
	System.out.println(num3);
	
	}
 
	public double demo2() {
		double num1 = 3;
		double num2 = 2;
		double num3 = 2;
		double num4 = num1*num2*num3;
		return num4;
	}
	

	
	
	
	
	public static void main(String[] args) {
		Method obj = new Method();
		obj.demo();
		double demo2 = obj.demo2();
		double demo3 = demo2*1;
		System.out.println(demo3);
	}
}
package day1;

public class Calculator {
	public void sumOfTwoDigits(int num,int num1) {
	int sum = num + num1;
	System.out.println(sum);

	}

	public int subOfThreeDigits(int num,int num1,int num2) {
		int sub = num - num1 - num2;
		return sub;
	}
	public int mulOfTwoDigits(int num,int num1) {
	 	 int mul = num *num1;
	 	 return mul;
	}
	public int divOfTwoDigits(int num,int num1) {
		int div = num /num1;
		return div;
	}
	
	public static void main(String[] args) {
	 	Calculator obj = new Calculator();
	 	obj.sumOfTwoDigits(2,4);
	 	int demo2 = obj.subOfThreeDigits(8, 6, 2);
	 	System.out.println(demo2);
	 	int demo3 = obj.mulOfTwoDigits(2,8);
	    System.out.println(demo3);
	 	int demo4 = obj.divOfTwoDigits(8, 4);
	 	System.out.println(demo4);
	 	}
	 	 
	}
		


package day1;

public class Maths {
 public float mulOfThreeDigits(float num1,float num2,float num3) {
	 float mul = num1 *num2 *num3;
	 return mul;
 }
public void mulOfThreeNumbers(float num,float num1,float num2) {
 float mul = num /num1 /num2;
 System.out.println(mul);
} 
public long sumOfTwoDigits(long num1,long num2) {
	long sum = num1 +num2;
	return sum;
	
}

public void allVariables() {
	// TODO Auto-generated method stub
byte num1 = 3;
float num2 = 4.90f;
short num3 = 23;
int num4 = 1234;
char num5 = 'A';
boolean num6 = true;
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
System.out.println(num5);
System.out.println(num6);

}
 public static void main(String[] args) {
	Maths obj = new Maths();
	float demo1 = obj.mulOfThreeDigits(2,4,4);
	System.out.println(demo1);
	obj.mulOfThreeNumbers(2,4,8);
	long call = obj.sumOfTwoDigits(12345L,98765L);
	long call1 =call *5;
	System.out.println(call1);
	obj.allVariables();
	System.out.println();
}
}

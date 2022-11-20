package day1;

public class Sample1 {
	
	byte noOfWheels = 4;
	short maxSpeed = 120;
	int carModelNo = 32314;
	long chasisNo  = 3214393102113L;
	float petrolCap = 10.5f;
	double mileage = 14.8999;
	char symbol = 's';
	boolean airBag = false;
	String carName = "Suzuki x fort 300";
	
	public static void main(String[] args) {
	Sample1 obj = new Sample1();
	
	
	System.out.println(obj.carModelNo);
	int carModelNo2 = obj.carModelNo;
	System.out.println(carModelNo2);
	
	
	
	}
	
	
}

package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Addition of numbers= " +cal.add(11, 1, 6));
		System.out.println("Addition of numbers= " +cal.sub(1, 1));
		System.out.println("Addition of numbers= " +cal.mul(113.34,22.34));
		System.out.println("Addition of numbers= " +cal.divide(10.3f, 3.3f));
	}

}

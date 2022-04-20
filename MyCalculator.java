package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	int result1=calc.add(4, 5, 6);
	System.out.println(result1);
	int result2 = calc.subtract(10, 5);
	System.out.println(result2);
	double result3 = calc.multiply(2.36, 5.87);
	System.out.println(result3);
	float result4 = calc.divide(10.987f,4.654f);
	System.out.println(result4);
}
}

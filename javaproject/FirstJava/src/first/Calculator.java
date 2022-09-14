package first;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("10+20=" + add(10,20) );   // 10+20=30
		System.out.println("100-10=" + substract(100, 10) );   // 100-10=90
		System.out.println("100*100=" + multifly(100, 100));    // 100*100=10000
		System.out.println("10/3=" + divide(10, 2));
	}
	// ① 숫자 두 개를 매개변수의 인자로 전달받아      더하기     메소드를 추가합시다.
	public static long add(long num1, long num2)
	{
		//long result = num1 + num2;
		//return result;
		return num1+num2;
			
	}
	//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	public static long substract(long num1, long num2) {
		return num1-num2;
	}
	//③숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	public static long multifly(long num1, long num2) {
		return num1*num2;
	}
	// ④숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

}

package chapter03.exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자 1을 입력해주세요.>>> ");
		int num1 = in.nextInt();
		
		System.out.println();
		
		System.out.print("숫자 2를 입력해주세요.>>> ");
		int num2 = in.nextInt();
		
		System.out.println("사칙연산의 결과 ==========");
		addResultPrint(num1, num2);
		substractResultPrint(num1, num2);
		multiflyResultPrint(num1, num2);
		divideResultPrint(num1, num2);
		
		////////////////////////////////////////////////////////
		
		System.out.print("원의 반지름을 입력해주세요.>>>  ");
		double rad = in.nextDouble();

		System.out.println();
		
		System.out.println("원의 둘레 : " + circum(rad));
		System.out.println("원의 넓이 : " + area(rad) );

	}
	
	/*
		
		 
		   원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	 */
	
	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아   /   원의 둘레를 구해    /     반환하는 메소드를 반환하는 메소드를 정의
	// 원의 둘레 : 2 x π x r  , π = 3.14 , r => 반지름 실수
	public static double circum(double r) {
		//     2 x π    x r 
		return 2 * 3.14 * r;
	}
	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아    /     원의 넓이를 구해     /    반환하는 메소드를 반환하는 메소드를 정의
	// 원의 넓이 : π x r x r
	public static double area(double r) {
		return 3.14 * r * r;
	}
	
	
	
	// ① 정수 두 개를 매개변수의 인자로 전달받아 /   더하기연산 후 출력하는   /  메소드를 정의
	public static void addResultPrint(long num1, long num2) {  //    num1 = 10은 형변환!!!
		System.out.println("두 수의 덧셈 결과 : " + ( num1 + num2 )); // 두 수의 덧셈 결과 : 12
	}
	// ② 정수 두 개를 매개변수의 인자로 전달받아 /    빼기연산 후 출력하는  /    메소드를 정의
	public static void substractResultPrint(long num1, long num2) {
		System.out.println("두 수의 뺄샘 결과 : "+ (num1-num2));		
	}
	// ③ 정수 두 개를 매개변수의 인자로 전달받아    /      곱하기연산 후 출력하는     /    메소드를 정의
	public static void multiflyResultPrint(long num1, long num2) {
		System.out.println("두 수의 곱샘 결과 : " + num1*num2);
	}
	// ④ 정수 두 개를 매개변수의 인자로 전달받아  /    나누기연산 후 출력하는  /     메소드를 정의
	public static void divideResultPrint(double num1, double num2) {
		System.out.println("두 수의 나눗셈 결과 : " + num1/num2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

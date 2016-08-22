import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Operator operate = new Operator();

		Scanner input = new Scanner(System.in);

		System.out.println("====연산자 계산기====");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");

		System.out.println("");
		System.out.print("연산자를 써주세요: ");
		String oper = input.next();

		if (oper.equals("+")) {
			System.out.print("두 숫자를 입력하세요: ");
			int numberOne = input.nextInt();
			int numberTwo = input.nextInt();
			int result = operate.add(numberOne, numberTwo);
			System.out.println("결과 : " + result);
		}

		if (oper.equals("-")) {
			System.out.print("두 숫자를 입력하세요: ");
			int numberOne = input.nextInt();
			int numberTwo = input.nextInt();
			int result = operate.sub(numberOne, numberTwo);
			System.out.println("결과 : " + result);
		}

		if (oper.equals("*")) {
			System.out.print("두 숫자를 입력하세요: ");
			int numberOne = input.nextInt();
			int numberTwo = input.nextInt();
			int result = operate.mult(numberOne, numberTwo);
			System.out.println("결과 : " + result);
		}

		if (oper.equals("/")) {
			System.out.print("두 숫자를 입력하세요: ");
			int numberOne = input.nextInt();
			int numberTwo = input.nextInt();
			int result = operate.div(numberOne, numberTwo);
			System.out.println("결과 : " + result);
		}

	}

}

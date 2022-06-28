import java.util.*;

public class Switchop {

	public static void main(String[] args) {
		int a, b;
		char op;

		Scanner scanner=new Scanner(System.in);
		// Take two numbers as input from user
		System.out.println("Enter Two Integers");
		a = scanner.nextInt();
		b = scanner.nextInt();

		// Taking operator as input from user
		System.out.println("Enter an Operator");
		op = scanner.next().charAt(0);

		switch (op) {
		case '+':
		System.out.format("%d + %d = %d\n", a, b, a + b);
		break;
		case '-':
		System.out.format("%d - %d = %d\n", a, b, a - b);
		break;
		case '*':
		System.out.format("%d * %d = %d\n", a, b, a * b);
		break;
		case '/':
		System.out.format("%d / %d = %d\n", a, b, a / b);
		break;
		default:
		System.out.println("ERROR: Unsupported Operation");
		}
		}
		


	

}

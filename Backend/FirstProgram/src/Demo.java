import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator");

		System.out.print("Enter a :");

		int a = sc.nextInt();

		System.out.print("Enter b :");
		int b = sc.nextInt();

		System.out.println("The sum of " + a + " + " + b + " is : " + (a + b));
		System.out.println("The sub of " + a + " - " + b + " is : " + (a - b));
		System.out.println("The mul of " + a + " * " + b + " is : " + (a * b));
		System.out.println("The div of " + a + " / " + b + " is : " + (a / b));
		System.out.println("The modulus of " + a + " % " + b + " is : " + (a % b));
		
		//System.out.println("The sum of a + b is : " + a + b );//concat
		//System.out.println("The sum of a + b is : " + (a + b) );//Addition
		//System.out.println("The sub of a - b is : " + a - b );//error
		//System.out.println("The sub of a - b is : " + ( a - b) ); substract
		//System.out.println( (a - b)+ " Is the sub of a - b "  );
		//System.out.println( a - b+ " Is the sub of a - b "  );
	}
}

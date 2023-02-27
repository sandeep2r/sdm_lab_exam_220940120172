import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum of "+num1+" and "+num2 +" is => "+sum);
	}

}


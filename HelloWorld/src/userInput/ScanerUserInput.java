package userInput;
import java.util.Scanner;

public class ScanerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
		
//		String hello = sc.nextLine();
//		System.out.println(hello);
		
		
		
		//calculating simple interest
		System.out.print("Enter Principle Amount:");
		int p = sc.nextInt();
		System.out.print("Enter Rate Of Interest:");
		double r = sc.nextDouble();
		System.out.print("Enter Time:");
		float t = sc.nextFloat();
		
		System.out.println("Simple Interest is: " + (p*r*t)/100);
	}

}

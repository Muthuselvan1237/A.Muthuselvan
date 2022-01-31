package muthuproj;

import java.util.Scanner;

public class OddOrEven {
	public static void main (String[] args) {
		int num;
		System.out.println("Enter an integar number:");
		Scanner input=new Scanner(System.in);
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("Entered number is even");
		System.out.println("Entered number is odd");
		
		
		
	}

}

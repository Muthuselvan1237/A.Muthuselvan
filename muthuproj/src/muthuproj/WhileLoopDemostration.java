package muthuproj;

import java.util.Scanner;

public class WhileLoopDemostration {
	public static void main(String[]args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any integer valu below 10:");
		number= sc.nextInt();
		while (number<=10)
		{
		sum=sum+number;
		number++;
	}
	System.out.format(" Sum of the Numbers from the while loop is: %d ",sum);	
     }
}

package muthuproj;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length=scanner.nextDouble();
		System.out.println("Enter the widh of Rectangle:");
		double widh=scanner.nextDouble();
		double area=length*widh;
		System.out.println("Area of rectangle is:"+area);
		
		
	}

}

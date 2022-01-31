package muthuproj;

public class TypeCasting {
	//Dont run this program-Just type and understanding how casting works

	public static void main(String[] args) {
		byte b=10;
		int i=b;//will accept - automatic tpe promotion
		byte d=(byte)i;//type casting makes it possible to store compatible types.
		byte x=10;
		byte y=20;
		int sum=x*y;
		System.out.println(sum);	
		
		
	}

}

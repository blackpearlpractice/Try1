import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		
		int a , b ;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the value of a:");
		a = s.nextInt();
		System.out.print("enter the value of b:");
		b = s.nextInt();
		
		System.out.println("output1 : "+(a+b)+"n");
		System.out.println("output2 : "+(a-b));
		System.out.println("output3 : "+(a*b));
		System.out.println("output4 : "+(a/b));
		System.out.println("output5 : "+(a%b));
		
		

	}

}

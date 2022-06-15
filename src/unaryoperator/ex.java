package unaryoperator; 

import java.util.Scanner;

public class  ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A;
		String B;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string for A:");
		
		A=sc.nextLine();
		
System.out.println("Enter string for B:");
		
		B=sc.nextLine();
		
		int c=A.length();
		
		int d=B.length();
		System.out.println(c+d);
		if(A.equals(B)) {
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
		String output = A.substring(0, 1).toUpperCase() + A.substring(1);
		String output1 = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(output+" "+output1);
		
	}

}


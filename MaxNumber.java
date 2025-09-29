//WAP TO ACCEPT 3 NUMBERS AND FIND MAXIMUM NUMBER OUT OF THREE NUMBERS.

import java.util.Scanner;
class MaxNumber{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter three nos.");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
	
		if(num1==num2 && num2==num3 && num3==num1){
			System.out.println("Numbers are Equal.");
		}else{
			if(num1>num2 && num1>num3)
				System.out.println(num1 + "is maximum number.");
			else if(num2>num1 && num2>num3)
				System.out.println(num2 + "is Maximum number.");
			else
				System.out.println(num3 + "is Maximum number.");
		}	
	}
}

// WAP TO FIND FACTORIAL OF A NUMBER.

import java.util.Scanner;

class Factorial{
	public static int factFunction(int num){
		int fact=1;
		if(num==1)
			return 1;	
		else{
			for(int i=1; i<=num; i++){
				fact= fact*i;
			}
		}
		return fact;
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		//three different ways 
		
		
		// if function is static and it is in same class.
		//int ans = factFunction(num);
		
		// if function is static and it is in different same class.
		int ans = Factorial.factFunction(num);
		System.out.println("Factorial of given number is " + ans);
		
		
		// if function is non-static.
		//Factorial obj = new Factorial();
		//obj.factFunction(num);
		//System.out.println("Factorial of given number is " + obj.factFunction(num));
		
	}
}
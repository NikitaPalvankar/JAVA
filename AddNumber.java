// WAP TO ADD NOS. FROM GIVEN RANGE 
import java.util.Scanner;

class AddNumber{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Range of number you want to perform addition.");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		for(int i=num1;i<=num2; i++){
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}
}
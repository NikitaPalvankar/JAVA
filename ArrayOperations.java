package com.Assignments;

import java.util.Scanner;

public class ArrayOperations {

	// To accept array elements from user
	public static void acceptData(int arr[][]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array elements: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	// To display array elements from user
	public static void displayData(int arr[][]) {
		System.out.println("Display Array elements: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	// Add all numbers
	public static int addAllNum(int[][] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		return sum;
	}

	// for row wise addition
	public static int[] addRow(int[][] arr) {
		int add[]= new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				add[i]=add[i]+arr[i][j];
			}
		}
		
		return add;
	}

	//for column wise addition
	public static int[] addCols(int arr[][]) {
		int addC[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++){
				addC[i]+=arr[j][i];
			}
		}
		
		return addC;
	}
	
	//To find Maximum number from an array
	public static int maxNum(int arr[][]) {
		int max=arr[0][0];
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max < arr[i][j])
				{
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	
	
	//to find row wise maximum number
	public static int[] rowMax(int arr[][]) {
		int temp[]=new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			int max= arr[i][0];
			for(int j=0; j<arr[i].length; j++) {
				if(max < arr[i][j] ) {
					max=arr[i][j];
				}
				temp[i]=max;
			}
		}
		return temp;
	}
	
	//to find column wise maximum number
		public static int[] colMax(int arr[][]) {
			int temp[]=new int[arr.length];
			
			for(int i=0; i<arr.length;i++) {
				int max= arr[i][0];
				for(int j=0; j<arr[i].length; j++) {
					if(max < arr[i][j] ) {
						max=arr[j][i];
					}
					temp[i]=max;
				}
			}
			return temp;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

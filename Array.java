package com.Assignments;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int arr[][] = new int[3][3];
//		int arr1[][] = new int[3][3];
//
//		ArrayOperations.acceptData(arr);
//		ArrayOperations.acceptData(arr1);

		int arr[][] = { { 2, 3, 4 }, { 5, 7, 6 }, { 8, 4, 9 } };
		int arr1[][] = { { 5, 6, 2 }, { 7, 5, 7 }, { 2, 3, 4 } };
		ArrayOperations.displayData(arr);
		ArrayOperations.displayData(arr1);

		// to select choice from menu
		int ch = 0;
		do {
			System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
			System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
			System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
			System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
			System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
			ch = sc.nextInt();

			switch (ch) {

			// 1. add all numbers
			case 1:
				System.out.println("The addtion of all numbers is " + ArrayOperations.addAllNum(arr));
				System.out.println("The addtion of all numbers is " + ArrayOperations.addAllNum(arr1));

				break;

			// 2. add row wise
			case 2:
				int[] addRow = ArrayOperations.addRow(arr1);
				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Rowwise Addtion " + i + 1 + "is " + addRow[i]);
				}

				break;

			// 3.column wise addition
			case 3:
				int[] addCol = ArrayOperations.addCols(arr1);
				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Column Addtion " + i + 1 + "is " + addCol[i]);
				}
				break;

			// 4. find max of all numbers
			case 4:
				System.out.println("Maximun number is " + ArrayOperations.maxNum(arr));
				System.out.println("Maximun number is " + ArrayOperations.maxNum(arr1));
				break;

			// 5. maximum row wise
			case 5:
				int[] maxRow = ArrayOperations.rowMax(arr);
				int[] maxRow1 = ArrayOperations.rowMax(arr1);
				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Rowwise Maximum is " + maxRow[i]);
				}

				break;

			// 6. find maximum column wise
			case 6:
				int[] maxcol = ArrayOperations.rowMax(arr);
				//int[] maxRow1 = ArrayOperations.rowMax(arr1);
				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Rowwise Maximum is " + maxcol[i]);
				}
				break;

			// 7. add 2 arrays
			case 7:

				break;

			// 8. multiply array
			case 8:

				break;

			// 9. find transpose of array
			case 9:

				break;

			// 10. check identity matrix
			case 10:

				break;

			// 11. rotate matrix rows
			case 11:

				break;

			// 12. rotate matrix columns
			case 12:

				break;

			// 13. convert to 1D array
			case 13:

				break;

			// 14. exit
			case 14:
				System.out.println("Thankyou!!");
				break;

			}

		} while (ch != 14);

	}

}

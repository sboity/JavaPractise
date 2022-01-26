package JavaProgramPractise;

import java.util.Scanner;

public class ArrayInputAndDisplay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = null;
		
		//enter array length
		System.out.println("Array length : ");
		int length = scan.nextInt();
		
		//assign size to array
		arr = new int[length];
		
		//take input values
		System.out.println("Enter array elements : ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		//print array elements
		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}

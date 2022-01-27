package JavaProgramPractise;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		//Take two array
		int arr1[] = {2,5,9,3,7};
		int arr2[] = {4,8,6,1,10};
		
		//create a new array
		int arr3[] = new int[arr1.length+arr2.length];
		
		//copy first array(arr1) to new array
		for(int i = 0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		
		//copy second array(arr2) to new array
		for(int i=0,j=arr1.length;j<(arr1.length +arr2.length);j++,i++) {
			arr3[j] = arr2[i];
		}
		
		//Display all arrays
		System.out.println("Array 1 " + Arrays.toString(arr1));
		System.out.println("Array 2 " + Arrays.toString(arr2));
		System.out.println("Merged Array is " + Arrays.toString(arr3));
	}

}

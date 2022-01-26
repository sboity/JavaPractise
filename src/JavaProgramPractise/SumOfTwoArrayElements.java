package JavaProgramPractise;

import java.util.Arrays;

public class SumOfTwoArrayElements {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,4,3,2,1};
		int arr3[] = new int[4];
		
		for(int i =0;i<arr3.length;i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println("Resultant array is  " + Arrays.toString(arr3));	

	}

}

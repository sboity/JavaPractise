package JavaProgramPractise;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int arr[] = {34,24,56,8,77};
		
		//Before sorting 
		System.out.println("Array before sorting " +Arrays.toString(arr));
		
		//sort array
		Arrays.sort(arr);
		
		//After sorting
		System.out.println("Array after sorting "+Arrays.toString(arr));

	}

}

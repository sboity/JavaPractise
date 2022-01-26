package JavaProgramPractise;

public class ArrayAverage {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int sum = 0;
		
		for (int i =0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("Array sum is : " + "  "+ sum);
		
		// Average 
		int average = sum/arr.length;
		System.out.println("Average is : " + "  "+average);

	}

}

package JavaProgramPractise;

public class ArrayLength {

	public static void main(String[] args) {
		int arr[] = {45,77,98,80};
		int arr1[] = new int[4];
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			arr1[3] = 40;
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		for(int e : arr1) {
			System.out.println(e+ " ");
		}

	}

}

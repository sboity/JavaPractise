package JavaProgramPractise;

public class ArrayReverse {
	
	public static void reverse(int a[],int n) {
		int b[] = new int[n];
		int j = n;
		for(int i = 0;i<n;i++) {
			b[j-1] = a[i];
			j= j-1;
		}
		
		//printing reverse array
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		reverse(arr, arr.length);		

	}

}

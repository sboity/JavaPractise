package JavaProgramPractise;

public class CompareTwoArray {

	public static void main(String[] args) {
		
		int arr1[] = {10,20,30,40};
		int arr2[] = arr1;
		int arr3[] = {20,30,40,50};
		int arr4[] = {30,40,50,60};
		
		if(arr1 == arr2) {
			System.out.println("arr1 and arr2 both are same");
		}else {
			System.out.println("arr1 and arr2 both are not same");
		}
		if(arr1 == arr3) {
			System.out.println("arr1 and arr3 both are same");
		}else {
			System.out.println("arr1 and arr3 both are not same");
		}
		if(arr1 == arr4) {
			System.out.println("arr1 and arr4 both are same");
		}else {
			System.out.println("arr1 and arr4 both are not same");
		}
		}
	}

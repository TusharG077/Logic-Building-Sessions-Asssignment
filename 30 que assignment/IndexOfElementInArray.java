import java.util.Scanner;
import java.util.Arrays;
class IndexOfElementInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array: ");
		int arrLen = sc.nextInt();
		
		int[] arr = new int[arrLen];
		System.out.print("Enter the Elements of Array: ");
		for(int i = 0; i<arrLen; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to search: ");
		int search = sc.nextInt();
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr,search);
		
		if(index==search){
			
		}
		System.out.print("The number "+ search +" is found at index : "+ index);
	}
}
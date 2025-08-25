import java.util.Scanner;
class AvgArrElements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array :");
		int arrayLen = sc.nextInt();
		int[] arr= new int[arrayLen];
		System.out.print("Enter the Elements of Array :");
		
		for(int i =0; i<arrayLen; i++){
			arr[i]=sc.nextInt();
		}
		
		int sum = 0;
		for(int element : arr){
			sum+=element;
		}
		float avg = sum/arrayLen;
		System.out.print("The Average of all numbers is: "+avg);
		
		
	}
}
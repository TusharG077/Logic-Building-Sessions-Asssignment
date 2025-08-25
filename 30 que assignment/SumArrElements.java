import java.util.Scanner;
class SumArrElements{
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
		System.out.print("The sum of all numbers is: "+sum);
		
		
	}
}
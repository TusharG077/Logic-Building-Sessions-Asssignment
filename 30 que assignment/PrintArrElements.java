import java.util.Scanner;
class PrintArrElements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array :");
		int arrayLen = sc.nextInt();
		int[] arr= new int[arrayLen];
		System.out.print("Enter the Elements of Array :");
		
		for(int i =0; i<arrayLen; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int element : arr){
			System.out.print(element+" ");
		}
		
		
	}
}
import java.util.Scanner;
import java.util.Arrays;

class PosNegNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of an Array :");
		int arrayLen = sc.nextInt();
		
		int[] arr= new int[arrayLen];
		System.out.print("Enter the Elements of Array :");
		
		int positive = 0;
		int negative= 0;
		for(int i =0; i<arrayLen; i++){
			arr[i]=sc.nextInt();
			if (arr[i] >= 0){
			positive++;
		}else{
			negative++;
		}
		}
		
		
		System.out.println("positive numbers: "+positive);
		System.out.println("negative numbers: "+negative);
	}
}
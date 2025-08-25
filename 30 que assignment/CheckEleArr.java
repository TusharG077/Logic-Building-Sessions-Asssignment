import java.util.Scanner;
import java.util.Arrays;
class CheckEleArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array: ");
		int arrLen = sc.nextInt();
		
		int[] arr = new int[arrLen];
		System.out.print("Enter the Elements of Array: ");
		for(int i = 0; i<arrLen; i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the Elements to search: ");
		int search = sc.nextInt();
		int count = 0;
		for(int j =0; j<arrLen; j++){
			if(arr[j] == search){
				count++;
			}
		}
		
		if(count==1){
				System.out.println("Found");
		}
		else{
				System.out.println("Not Found");
		}
		
		
		
		
		
		
		/*for(int ele : arr){
			System.out.println(ele);
		}*/ 
		
		
		
	}
}
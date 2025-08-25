import java.util.*;
//import java.util.Arrays;
class LargestEleInArr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int ArrLen = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		int[] arr = new int[ArrLen];
		for(int i =0; i<ArrLen; i++){
			arr[i]=sc.nextInt();
		}
		/*for(int ele : arr){
			System.out.println(ele);
		}*/
		
		Arrays.sort(arr);
		System.out.println("The largest element is: "+arr[ArrLen - 1]);
		
	}
}
import java.util.Scanner;
class CalSumN{
	static void calculateSum(int n){
		int sum = 0;
		for(int i = 1; i<=n;i++){
			sum+=i;
		}
		System.out.println("The sum of numbers from 1 to N is :"+ sum);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number till you wanted sum: ");
		int number = sc.nextInt();
		calculateSum(number);
	}
}
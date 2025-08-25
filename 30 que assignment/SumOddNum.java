import java.util.Scanner;
class SumOddNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		int count = 0;
		for (int i =1; i<=num; i+=2){
			count+=i;
		}
		System.out.println("The sum of odd numbers from 1 to "+num+ " is: "+count);
	}
}
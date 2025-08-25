import java.util.Scanner;
class SumOfNumbers{
	
	static int sumOfTwoNumbers(int x, int y){
		return x+y;
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Num: "); 	
	int a = sc.nextInt();
	System.out.println("Enter the Second Num: "); 
	int b = sc.nextInt();
	
	int sum = sumOfTwoNumbers(a,b);
	System.out.println("Your Sum is: "+sum); 
	}
	
	
}



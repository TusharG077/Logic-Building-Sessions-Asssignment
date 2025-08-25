import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Factorial Number:");
		int num = sc.nextInt();
		int count = 1;
		for (int i =1; i<=num; i++){
			count = count * i;
		}
		System.out.println("Factorial of "+num+ " is: "+count);
	}
}
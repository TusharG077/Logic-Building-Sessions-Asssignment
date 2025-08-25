import java.util.Scanner;
class EvenNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		
		for (int i =2; i<=num; i+=2){
			System.out.println(i);
		}
	}
}
import java.util.Scanner;
class PrintMultipleOfN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		
		for (int i =3; i<=num; i+=3){
			System.out.println(i);
		}
	}
}
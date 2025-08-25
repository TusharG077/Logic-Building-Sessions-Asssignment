import java.util.Scanner;
class ScannerClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your Height: ");
		float height = sc.nextFloat();
		
		System.out.println("Hello, "+name+","+"Your Age is: "+age+","+ " Your Height is: "+height);
	}
}
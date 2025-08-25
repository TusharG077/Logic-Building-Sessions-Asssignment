import java.util.Scanner;
class demo{
  public static void main(String[] args)
  {
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if (number % 2 == 0){
		System.out.println("It is an even number.");
	}
	else{
		System.out.println("It is a odd number.");
	}
		
}
}
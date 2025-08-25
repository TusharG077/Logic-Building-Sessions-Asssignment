import java.util.Scanner;
class demo{
  public static void main(String[] args)
  {
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if (number >= 1){
		System.out.println("It is a positive number.");
	}
	else{
		System.out.println("It is not positive number.");
	}
		
}
}
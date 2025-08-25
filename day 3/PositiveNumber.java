import java.util.Scanner;
class PositiveNumber{
	static void askForPositiveNumber(){
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter the Number: ");
			int num = sc.nextInt();
		}
		while(num < 0);
	}
	
	
	public static void main(String args[]){
		askForPositiveNumber();
	}
}


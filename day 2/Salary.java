import java.util.Scanner;
class Salary{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Your Salary of a Month: ");
		int salary = sc.nextInt();
		
		for(int i =1 ; i<=12; i++){
			System.out.println(salary +" X "+i+ " = " + salary*i);
		}
	}
}
import java.util.Scanner;
class Person{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your Gender (male/ female): ");
		String gender = sc.next();
		
		if(age <= 2){
			System.out.println("You are an Infant.");
		}
		else if(age > 2 && age <= 10){
			
			if(gender.equals("male")){
				System.out.println("You are a Boy.");
			}
			else{
				System.out.println("You are Girl.");
			}
	
		}
		else if(age > 10 && age <=20){
			System.out.println("You are Young.");
		}
		else if(age > 20 && age <=50){
			System.out.println("You are an Adult.");
		}
		else{
			if(gender.equals("male")){
				System.out.println("You are a GrandPa.");
			}
			else{
				System.out.println("You are GrandMa.");
			}
		}
	}
}
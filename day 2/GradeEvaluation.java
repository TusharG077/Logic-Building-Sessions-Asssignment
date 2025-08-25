import java.util.*;
class GradeEvaluation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of Physics: ");
		int physics = sc.nextInt();
		
		System.out.println("Enter the marks of Chemistry: ");
		int chemistry = sc.nextInt();
		
		System.out.println("Enter the marks of Maths: ");
		int maths = sc.nextInt();
		
		float avg = (physics+ chemistry+ maths) / 3;
		
		System.out.println("Your Average Marks is: "+avg);
		
		if (avg >= 90){
			System.out.println("Your Grade is: A");
		}
		else if (avg >= 70 && avg <=89){
			System.out.println("Your Grade is: B");
		}
		else if (avg >= 50 && avg<= 69){
			System.out.println("Your Grade is: C");
		}
		else if (avg >= 30 && avg<= 49){
			System.out.println("Your Grade is: D");
		}
		else{
			System.out.println("You are Fail, Better Luck Next Time!");
		}
	}
}
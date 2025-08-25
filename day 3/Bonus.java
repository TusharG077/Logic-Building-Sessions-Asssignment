import java.util.Scanner;
class Bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of problem below: ");
		System.out.println("Problem 1: Grade Evaluation System"/n
							"Problem 2: Leap Year Check"/n
							"Problem 3: Day of the week "/n
							"Problem 4: Identify Default Values of Variables"/n 
							"Case 5: Exit ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: Scanner input = new Scanner(System.in);
		
					System.out.println("Enter the marks of Physics: ");
					int physics = input.nextInt();
		
					System.out.println("Enter the marks of Chemistry: ");
					int chemistry = input.nextInt();
		
					System.out.println("Enter the marks of Maths: ");
					int maths = input.nextInt();
		
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
					break;
		
			case 2: Scanner sca = new Scanner(System.in);
		
					System.out.println("Enter the year which you want to check: ");
					int year = sca.nextInt();
		
					if (year % 4 == 0){
						if (year % 100 != 0 || year % 400 == 0) {
							System.out.println(""+ year + " is a Leap Year.");
						}
						else{
							System.out.println(""+ year + " is Not a Leap Year.");
						}
					}
					else{
						System.out.println(""+ year + " is Not a Leap Year.");
					}
					break;
		
			case 3: Scanner scan = new Scanner(System.in);
					System.out.println("Enter the number of Day: ");
					int day = scan.nextInt();
		
					switch(day){
						case 1: System.out.println("Monday");
								break;
			
						case 2: System.out.println("Tuesday");
								break;
			
						case 3: System.out.println("Wednesday");
								break;
			
						case 4: System.out.println("Thursday");
								break;
			
						case 5: System.out.println("Friday");
								break;
			
						case 6: System.out.println("Saturday");
								break;
			
						case 7: System.out.println("Sunday");
								break;
			
						default: System.out.println("Invalid Day!, Try Again!");
								break;
					}
					break;
		
			case 4: byte a = 1;
					short b = 50;
					int c = 1_00_000;
					long d = 100_00_00_000;
					float e = 3.14f;
					double f = 12345.67;
					char g = 'A'; // g = 'a';
					boolean h = true;
		
					System.out.println("byte : "+a);
					System.out.println("short : "+b);
					System.out.println("int : "+c);
					System.out.println("long : "+d);
					System.out.println("float : "+e);
					System.out.println("double : "+f);
					System.out.println("char : "+g);
					System.out.println("boolean : "+h);
					break;

			default:System.out.println("Exit");
					break;		
		}
	}
	
}
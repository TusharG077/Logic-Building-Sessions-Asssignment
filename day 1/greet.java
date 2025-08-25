import java.util.Scanner;
class demo{
  public static void main(String[] args)
  {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter current time: ");
	int time = sc.nextInt();
	if (time > 5 && time < 12){
		System.out.println("Good Morning, CDAC!");
	}
	
}
}
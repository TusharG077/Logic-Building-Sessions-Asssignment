import java.util.*;
class printStringElements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of names :");
		int number = sc.nextInt();
		String[] str1 = new String[number];
		System.out.print("Enter the names which you want to store in String :");

		for(int i=0; i<str1.length; i++){
			str1[i]=sc.next();
		}
		
		for(String name : str1){
			System.out.println(name);
		}
		
		
		
	}
}
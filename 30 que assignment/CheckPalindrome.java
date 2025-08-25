import java.util.*;
class CheckPalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		str= str.toLowerCase();
		String reversed = "";
		for(int i =str.length() -1; i>=0; i--){
			char ch = str.charAt(i);
			reversed+=ch;
		}
		if(str.equals(reversed)){
			System.out.print("The string "+ "'" + str +"'"+ " is a palindrome.");
		}else{
			System.out.print("The string "+ " ' " + str +" ' "+ " is Not palindrome.");
		}
		
		
		
	
		
		
	}
}
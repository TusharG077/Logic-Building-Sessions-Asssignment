import java.util.*;
class RevString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String reversed = "";
		for(int i= str.length() -1; i>=0; i--){
			reversed=reversed + str.charAt(i);
		} 
		System.out.print("Reversed string: "+reversed);
		
		
	
		
		
	}
}
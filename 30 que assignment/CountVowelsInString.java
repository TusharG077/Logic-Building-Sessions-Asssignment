import java.util.Scanner;
class CountVowelsInString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();//imp
		
		int count = 0;
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);//imp
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
				count++;
			}
		}
		System.out.println("The number of vowels in "+ "'"+ str+"'" +" is: "+count);
		
	}
}
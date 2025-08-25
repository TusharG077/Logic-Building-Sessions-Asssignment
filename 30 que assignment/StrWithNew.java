class StrWithNew{
	public static void main(String args[]){
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		boolean check1 = (str1 == str2);
		boolean check2 = (str1.equals(str2));
		
		System.out.println("Using ==: "+ check1); 
		System.out.println("Using .equals(): "+ check2); 
	}
}
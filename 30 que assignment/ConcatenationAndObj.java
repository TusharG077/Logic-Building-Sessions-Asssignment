class ConcatenationAndObj{
	public static void main(String args[]){
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1+str2;
		
		boolean check = (str3 == str1);
		System.out.println("Is str3 pointing to the same object as str1? : "+ check); 
	}
}
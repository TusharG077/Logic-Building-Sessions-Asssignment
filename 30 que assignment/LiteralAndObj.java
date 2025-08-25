class LiteralAndObj{
	public static void main(String args[]){
		String str1 = "hello";
		String str2 = "hello";
		
		boolean check = (str1 == str2);
		//boolean check2 = (str1.equals(str2));//me
		
		
		System.out.println("Both variables point to the same object: "+ check); 
		//System.out.println("Using equals: "+ check2); //me
		}
}

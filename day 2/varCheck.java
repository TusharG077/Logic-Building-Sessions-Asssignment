// class varCheck{
	// public static void main(String args[]){
		// byte a = 1;
		// short b = 50;
		// int c = 1_00_000;
		// long d = 100_00_00_000;
		// float e = 3.14f;
		// double f = 12345.67;
		// char g = 'A'; // g = 'a';
		// boolean h = true;
		
		// System.out.println("byte : "+a);
		// System.out.println("short : "+b);
		// System.out.println("int : "+c);
		// System.out.println("long : "+d);
		// System.out.println("float : "+e);
		// System.out.println("double : "+f);
		// System.out.println("char : "+g);
		// System.out.println("boolean : "+h);
	// }
// }

class demo2{
	    byte a = 1;
		short b = 50;
		int c = 1_00_000;
		long d = 100_00_00_000;
		float e = 3.14f;
		double f = 12345.67;
		char g = 'A'; // g = 'a';
		boolean h = true;
		
		
}
class varCheck{
	public static void main(String args[]){
		demo2 obj = new demo2();
		
		System.out.println("byte : "+ obj.a);
		System.out.println("short : "+ obj.b);
		System.out.println("int : "+ obj.c);
		System.out.println("long : "+ obj.d);
		System.out.println("float : "+ obj.e);
		System.out.println("double : "+ obj.f);
		System.out.println("char : "+ obj.g);
		System.out.println("boolean : "+ obj.h);
	}
}


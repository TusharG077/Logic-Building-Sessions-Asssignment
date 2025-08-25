class ArrEx{
	public static void main(String args[]){
		double [] height = {5.10,5.11,5.33,5.3,5.1,4.7,6.5,5.11,5.9,6.1};
		double sum= 0;
		int count = height.length;
		for(double element : height){
			sum+=element;
		}
		double avg = (sum / count);
		System.out.println(avg);
		//System.out.println((5.10+5.11+5.33+5.3+5.1+4.7+6.5+5.11+5.9+6.1)/10);
	}
}
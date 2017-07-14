package logic;

public class SumPowerNext {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 4165 );
	System.out.println( output1 );
	}
	public static void userMethod( int input1 ) {
		String str=Integer.toString( input1 );
		int sum=0;
		int first=Character.getNumericValue(str.charAt(0));
		int last=Character.getNumericValue(str.charAt(str.length()-1));
		for( int i=0 ; i<str.length()-1;i++ ){
			int pr=1;
			int n1=Character.getNumericValue(str.charAt(i+1));
			for(int j=0;j<n1;j++){
				int n=Character.getNumericValue(str.charAt(i));
				pr*=n;
			}
			sum+=pr;
		}
		
		output1=sum+1;
	}
}
	
	

package logic;

public class SumPower {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 1234 ); 
	System.out.println( output1 ); 
}
	public static void userMethod(int input1){
		int x=input1;
		int r=0;
		int count=0;
		int sum=0;
		while(x>0){
			count++;
			x/=10;
		}
		while(input1>0){
			int p=1;
			r=input1%10;
			for(int i=0;i<count;i++){
				p*=r;
			}
			sum+=p;
			input1/=10;
		}
		output1=sum;
	}
}
			
		
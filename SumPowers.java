package logic;

public class SumPowers {
	public static int output1;
	public static void main( String [] args ) {
		userMethod( 1234 ); 
		System.out.println( output1 ); 
	}
	public static void userMethod(int input1) {
		int count=0;
		int temp=input1;
		while(temp!=0){
			count++;
			temp/=10;
		}
		int sum=0;
		count-=1;
		while(input1!=0){
			int r=input1%10;
			int p=1;
			for(int i=0;i<count;i++){
				p*=r;
			}
			sum+=p;
			input1/=10;
			count--;
		}
		output1=sum;
	}
}

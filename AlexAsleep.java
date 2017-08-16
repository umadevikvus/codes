package guvi4;

import java.util.Scanner;

public class AlexAsleep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] state=new int[n];
		int[] frnd=new int[k];
		int count=0;
		for(int i=0;i<n;i++) {
			state[i]=in.nextInt();
		}
		for(int i=0;i<k;i++) {
			frnd[i]=in.nextInt();
		}
		in.close();
			for(int j=0;j<k;j++){
			if(state[frnd[j]-1]==1){
				count++;
			}
			}
		//System.out.println(count);
		if(count==k) {
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}

}

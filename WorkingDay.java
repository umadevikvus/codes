package guvi;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String day = in.next();
		in.close();
		System.out.println(WorkingDays(day));
	}
	static boolean WorkingDays(String day){
		if(day.equalsIgnoreCase("Sunday")){
		return false;
		}
		return true;
	} 
		
}	


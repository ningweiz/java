package hello;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ctemp;
		int ftemp;
		Scanner in=new Scanner(System.in);
	
		  ftemp=in.nextInt();
	      ctemp=(int)((ftemp-32)/(9/5.0)); 	 
		System.out.print(ctemp);	
	}

}

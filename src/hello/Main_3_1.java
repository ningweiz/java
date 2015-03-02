package hello;

import java.util.Scanner;

public class Main_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num,cont=0,cout=0;
		num=in.nextInt();
		while(num>0 && num<100000){
			if(num==-1){
				break;
			}
			if (num%2==0){
				cont=cont+1;
			}
			else{
				cout=cout+1;
			}
			num=in.nextInt();
		}
		System.out.println(cout+" "+cont);
	}

}

package hello;

import java.util.Scanner;

public class Java_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=(int)(Math.random()*100);
		Scanner in=new Scanner(System.in);
		int a;
		int count=0;
		do{
			a=in.nextInt();
			count=count+1;
          if(a>number)
          {
        	  System.out.println("偏大"); 
          }  
          else if(a<number)
          {
        	  System.out.println("偏小"); 
          }
		}while(a!=number);
		System.out.println("恭喜你猜对了"+"猜了"+count+"次");
	}
}

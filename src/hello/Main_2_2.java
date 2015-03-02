package hello;

import java.util.Scanner;

public class Main_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner in=new Scanner(System.in);
           int bjt=in.nextInt();
           int h=bjt/100;
           int m=bjt%100;
           if(bjt>=0 && bjt<=2359)
           {
        	   switch(h){
        	   case 8:
        		   System.out.println(m);
        		   break;
        	   }        	   
        	if(h>8){
        		System.out.print(h-8);
        	}   
        	if(h<8){
        		System.out.print(24-(8-h));
        	}
        	if(h>8 || h<8){
        		if(m>=10)
        		{
        		System.out.print(m);
        		}
        		else{
        			System.out.print("0"+m);
        		}
        	}
           }
           else
           {
        	   System.out.print("error");
        	   }
	}

}

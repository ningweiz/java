package hello;

import java.util.Scanner;
public class Main_3_2{
   
	public static void main(String[] args)
	{
	      
		Scanner in = new Scanner(System.in);    
		int num = in.nextInt();
	    int x;
		int n=1;
		int jz = 1;
		int sum=0;
		if(num>=0 && num<=1000000){
			do{
		    x=num%10;
		    if(x%2==n%2)
		    {
		    	sum=sum+jz;
		    }
		    num/=10;
		    n++;
		    jz=jz*2;		    
			}while(num>0);
			System.out.print(sum);
		}
		else{
			System.out.print("error");
		}
		
        
		
   }
	}

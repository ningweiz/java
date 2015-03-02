package hello;

import java.util.Scanner;

public class Java_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		int m=in.nextInt();
		int count=0;
        for(int n=2;n<200;n++)
        {
        	int flag=1;
        	for(int i=2; i<n;i++)
        	{
        		if(n % i==0)
        		{   
        			flag=0;
        			break;
        		}
        	}	
        	
        		if(flag==1)
        		{
        			count++;
        			if(count<=50)
        			{
        			System.out.println("µÚ"+count+"¸öËØÊý:"+n+" ");
        			}
        		}
        		
        	}
           
   }
 }


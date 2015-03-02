package hello;

import java.util.Scanner;

public class Main_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//素数和 我们认为2是第一个素数，3是第二个素数，
		//5是第三个素数，依次类推。现在，给定两个整数n和m，0<n<=m<=200，
		//你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int sum=0,count=1;
		if(n<=m&&m<=200){
			for(int i=2;count<=m;i++)
			{
				int flage=1;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flage=0;
						break;
					}
				}
					if(flage==1)
					{					
						if(count>=n)
						{
							sum+=i;
						}
						count++;
					}											
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		}           
   }



package hello;

import java.util.Scanner;

public class Xt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int num;
       int count = 0;
       int a=(int)(Math.random()*100+1);
        
        do{
        	 num=in.nextInt();
        	 count=count+1;
        if(num>a){
        	System.out.println("ƫ��");
        }
        else if(num<a)
        {
        	System.out.println("ƫС");
        }
       
        }while(num!=a);
        System.out.println("�¶�"+"����"+count+"��");
	
	
	}
}

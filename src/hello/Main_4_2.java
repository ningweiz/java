package hello;

import java.util.Scanner;

public class Main_4_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int num1=in.nextInt();
       int num2=0;
       int targ=0;
       if(num1>=-100000&&num1<=100000)
       {
	       if(num1<0)
	       {
	    	   System.out.print("fu ");
	    	   num1*=-1;
	       }
          if(num1%10==0)
          {
        	  num1+=1;
        	  targ=1;
          }
	       while(num1>0)  
	       {
	      num2 *=10;
	      num2 += num1%10;
	      num1 /=10; 
	       }
       while(num2>0)
       {
	       switch(num2%10)
	       {
	       case 0: 
	    	   System.out.print("ling");break;
	       case 1: 
	       if(targ==1&&num2/10==0)
	       {
	    	   System.out.print("ling");break;
	       }
	       else{System.out.print("yi");break;}
	    	   
	       case 2: 
	    	   System.out.print("er");break;
	       case 3: 
	    	   System.out.print("san");break;
	       case 4: 
	    	   System.out.print("si");break;
	       case 5: 
	    	   System.out.print("wu");break;
	       case 6: 
	    	   System.out.print("liu");break;
	       case 7: 
	    	   System.out.print("qi");break;
	       case 8: 
	    	   System.out.print("ba");break;
	       case 9: 
	    	   System.out.print("jiu");break;
	       
	       }
	       num2/=10;
	       if(num2 !=0)System.out.print(" ");
	       else break;
       }
       }
       else
       {
    	   System.out.println("error");
       }
	}
}

package hello;

import java.util.Scanner;

public class Java_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		 int sum=0;
		while(true){
		System.out.print("请投币:");
         Scanner in=new Scanner(System.in);
         int amout=in.nextInt();        
         sum=sum+amout;
         if(sum>=10){
        	
        	 System.out.println("出票成功");
        	 System.out.println("找零：" + (sum-10));
        	 sum=0;
         }

         }	*/
		
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();    
        int count=0;
        while( num > 0){
        	num=num/10;
        	count=count+1;      	
        }
        System.out.println(count);
        
		/*int con=10;
		do{
			System.out.println(con);
			con=con-1;
		}while(con>0);
		System.out.println("biu");*/
//		int sum=0,cont=0,number;
//		 Scanner in=new Scanner(System.in);
//         number=in.nextInt();  
//         while(number != -1){
//        	 sum=sum+number;
//        	 cont=cont+1;
//        	 number=in.nextInt(); 
//         }
//         if(cont>0){
//         System.out.println((double)sum/cont);
//         }
    }

}

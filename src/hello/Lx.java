package hello;

import java.util.Scanner;

public class Lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          int num=in.nextInt();
          System.out.println("��λ:"+(num%10));
          System.out.println("ʮλ:"+(num/10)%10);
          System.out.println("��λ:"+(num/100)%10);
          System.out.println("ǧλ:"+(num/1000)%10);
          System.out.println("��λ:"+(num/10000)%10);
	}

}

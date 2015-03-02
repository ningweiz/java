package hello;

import java.util.Scanner;

public class Lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in=new Scanner(System.in);
          int num=in.nextInt();
          System.out.println("个位:"+(num%10));
          System.out.println("十位:"+(num/10)%10);
          System.out.println("百位:"+(num/100)%10);
          System.out.println("千位:"+(num/1000)%10);
          System.out.println("万位:"+(num/10000)%10);
	}

}

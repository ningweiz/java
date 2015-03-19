package hello;
import java.util.Scanner;
public class Java_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub £¬
		Scanner in = new Scanner(System.in);	
		int x = in.nextInt() ;
		int[] number=new int[10];
		while(x!=-1)
		{
			if(x>=0&&x<=9)
			{
				number[x]++;
			}
			x=in.nextInt();
		}
		for(int i=0;i<number.length;i++)
		{
			System.out.println(i+":"+number[i]);
		}
	}
}

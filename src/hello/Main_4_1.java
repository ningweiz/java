package hello;

import java.util.Scanner;

public class Main_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ������Ϊ2�ǵ�һ��������3�ǵڶ���������
		//5�ǵ������������������ơ����ڣ�������������n��m��0<n<=m<=200��
		//��ĳ���Ҫ�����n����������m������֮�����е������ĺͣ�������n�������͵�m��������
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



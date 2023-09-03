package Anant;

import java.util.Scanner;

public class Square {

	public static int totalsquare(int n)
	{int count=0;
		for(int i=1;i<=n;i++)
		{
			count+=(n-i+1)*(n-i+1);
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		int result=totalsquare(n);
		System.out.println("total square are"+result);

	}

}

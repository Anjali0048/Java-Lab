package Anjali;

import java.util.Arrays;
import java.util.Scanner;

public class Lexico {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 characters:");
		String[] x= new String[5];
		for(int i=0;i<5;i++)
		{
			x[i]=sc.next();
		}
		System.out.println("string without sorted:");
		for(int i=0;i<5;i++){
				System.out.print(x[i]+ " ");
		}
		System.out.println();
		// Arrays.sort(x);
		for(int i=0; i<5; i++){
			for(int j=i+1; j<5; j++){
				if(x[i].compareTo(x[j])>0){
		 			String temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println("string after sorted:");
		for(int i=0;i<5;i++){
				System.out.print(x[i]+ " ");
		}
	}

}

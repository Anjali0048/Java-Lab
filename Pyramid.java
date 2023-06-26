// not correct

package Anjali;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		   System.out.println("enter the no. of rows in pyramid");
			  int n=sc.nextInt();
			  
		    for (int row = 1; row < n+1; row++) {
		    	 
		      for (int space = row; space < n-row; space++) {
		        System.out.print(" ");
		      }

		      for(int col = row; col<=2*row-1; col++){
		        System.out.print(col+" ");
		      }

		      for(int k = 2*row-2; k>=row; k--){
		        System.out.print(k+" ");
		      }

		      System.out.println();
		}
		}

	}
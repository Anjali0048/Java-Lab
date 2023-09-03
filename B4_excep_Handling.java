package Anjali;
import java.util.*;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8};
		try {
			try{
				int value=arr[9];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("index out of bound");
			}
			System.out.println(4/0);
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic exception :divide by 0");
		}
	}
}
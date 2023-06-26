package Anjali;

public class Overloading {
	
	static int add(int a, int b){
		return a+b;
	}
    static int add(int a, int b, int c){
        return a+b+c;
    }

	public static void main(String[] args) {	
		// Overloading obj = new Overloading();
		System.out.println(Overloading.add(1,3));
		System.out.println(Overloading.add(1,3,5));
	
	}
}


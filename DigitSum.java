import java.util.*;
public class Digit{
    public static void calc(int n) {
        int sum = 0;
        while(n>0 || sum>9){
            if(n==0){
                n = sum;
                sum = 0;
            }
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        calc(n);
    }
}
// error

import java.util.*;

class MatrixSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input");
            return;
        }
        else{
            int sum = 0;
            while(sum!=0){
                sum += num*num;
                num--;
            }
            System.out.println(sum)
        }
    }
}
// error

interface Subtraction{
    void sub(int a, int b);
}
interface Addition{
    void add(int a, int b);
}
class operate implements Subtraction, Addition{
    public void sub(int a, int b) {
        int diff = a-b;
        System.out.println("Substraction is : "+diff);
    }
    public void add(int a, int b) {
        int sum = a+b;
        System.out.println("Substraction is : "+sum);
    }
}

class Main{
    public static void main(String args[]) {
        operate op = new operate();
        op.sub(10, 5);
        op.add(2,4);
    }
}
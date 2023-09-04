public class Overloading {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Overloading example = new Overloading();

        int sum1 = example.add(5, 10);
        int sum2 = example.add(5, 10, 15);
        double sum3 = example.add(2.5, 3.5);
        String result = example.concatenate("Hello ", "World!");

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Concatenation: " + result);
    }
}

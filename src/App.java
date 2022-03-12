import datastructure.Recursive;

public class App {
    public static void main(String[] args) {
        // new recursive object
        Recursive r = new Recursive();

        // call fact method
        System.out.println("Factorial of 4 is " + r.fact(5));

        // call powerBase2 method
        System.out.println("2^4 is " + r.powerBase2(4));

        // call power method
        System.out.println("2^4 is " + r.power(2, 4));

        // call numDigits method
        System.out.println("Number of digits in 12345 is " + r.numDigits(12345));
    }
}

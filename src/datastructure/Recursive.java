package datastructure;

public class Recursive {
    // recursive factorial method
    public int fact(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        } else { // general case
            return n*fact(n-1);
        }
    }

    // recursive function to calculate 2^n
    public int powerBase2(int n) {
        // base case
        if (n == 0) {
            return 1;
        } else { // general case
            return 2*powerBase2(n-1);
        }
    }

    // recursive function to calculate m^n
    public int power(int m, int n) {
        // base case
        if (n == 0 || m == 1) {
            return 1;
        } else { // general case
            return m*power(m, n-1);
        }
    }

    // recursive function to return the number of digits in a number
    public int numDigits(int n) {
        // base case
        if (n < 10 && n >= 0) {
            return 1;
        } else { // general case
            return numDigits(n/10) + 1;
        }
    }
}
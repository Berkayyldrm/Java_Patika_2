//https://www.hackerrank.com/challenges/java-exception-handling/problem

import java.util.Scanner;
class MyCalculator {
    public int power(int n, int p) throws Exception{
        if((n > 0 && p >=0) || (n >= 0 && p > 0)) {
            int res = 1;
            for (int i = 0; i < p; i++) {
                res *= n;
            }
            return res;
        } else if(n == 0 && p ==0) throw new Exception("n and p should not be zero.");
        else throw new Exception("n or p should not be negative.");
    }
}

public class Main {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
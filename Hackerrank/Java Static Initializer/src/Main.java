// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    static boolean flag;
    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt(), H = input.nextInt();
    static {
        if (B > 0 && H > 0) {
            flag = true;
        }
        else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

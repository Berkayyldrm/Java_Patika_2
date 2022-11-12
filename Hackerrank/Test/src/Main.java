import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] test = {3,5,7,8,7,9};
        //System.out.println(Arrays.toString(test));
        int[] test2 = test.clone();

        int[] test3 = new int[10];
        test3 = Arrays.copyOf(test2, 10);
        //System.out.println(Arrays.toString(test3));
        //System.out.println(test3.length);
        HashSet<Integer> hset = new HashSet<>();

        String str1 = "test";
        String str2 = "test";
        System.out.println(str1.compareTo(str2));
    }
}
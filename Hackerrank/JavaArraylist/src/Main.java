import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthInput = input.nextInt();
        List<List> arr = new ArrayList<>();

        for (int i = 0; i < lengthInput; i++) {
            List<Integer> subArr = new ArrayList<>();
            int lengthArr = input.nextInt();
            for (int j = 0; j < lengthArr; j++) {
                subArr.add(input.nextInt());
            }
            arr.add(subArr);
        }

        int lengthInputQuery = input.nextInt();
        for (int i = 0; i < lengthInputQuery; i++) {
            for (int j = 0; j < 1; j++) {
                int x = input.nextInt();
                int y = input.nextInt();
                try {
                    List<List> selection = arr.get(x - 1);
                    System.out.println(selection.get(y - 1));
                }
                catch(Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
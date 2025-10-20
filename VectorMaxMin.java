import java.util.Vector;
import java.util.Scanner;

public class VectorMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < 5; i++) {
            v.add(sc.nextInt());
        }

        // Initialize max and min with first element
        int max = v.get(0);
        int min = v.get(0);

        // Find max and min manually
        for (int i = 1; i < v.size(); i++) {
            int val = v.get(i);
            if (val > max)
                max = val;
            if (val < min)
                min = val;
        }

        System.out.println("Vector elements: " + v);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        sc.close();
    }
}

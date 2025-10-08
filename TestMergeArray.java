import java.util.*;

class MergeTwoArray {
    int[] arr1;
    int[] arr2;

    // Parameterized constructor
    MergeTwoArray(int[] a1, int[] a2) {
        arr1 = a1;
        arr2 = a2;
    }

    // Method to merge two arrays
    int[] getMergeArray() {
        int[] merged = new int[arr1.length + arr2.length];
        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        return merged;
    }
}

public class TestMergeArray {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[4];

        System.out.println("Enter 5 values for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Enter 4 values for second array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = xyz.nextInt();
        }

        // Create object of MergeTwoArray
        MergeTwoArray obj = new MergeTwoArray(a, b);
        int[] merged = obj.getMergeArray();

        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}

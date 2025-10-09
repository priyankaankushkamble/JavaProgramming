import java.util.*;

// Parent class
class ArrSum {
    protected int[] arr; // store array

    // Method to set array values
    public void setValue(int arr[]) {
        this.arr = arr;
    }
}

// Child class
class GetSum extends ArrSum {

    // Method to calculate sum of array elements
    public int getArrSum() {
        int sum = 0;
        if (arr != null) {
            for (int num : arr) {
                sum += num;
            }
        }
        return sum;
    }
}

// Main class to test
public class ArraySumMain {
    public static void main(String[] args) {
        Scanner xyz= new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = xyz.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = xyz.nextInt();
        }

        // Using classes
        GetSum gs = new GetSum();
        gs.setValue(numbers); // set array values
        int sum = gs.getArrSum(); // get sum
        System.out.println("Sum of array elements: " + sum);
    }
}

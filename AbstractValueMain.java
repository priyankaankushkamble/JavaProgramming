// Abstract class
abstract class Value {
    protected int a, b; // instance variables to store values

    // Non-abstract method to set values
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method declaration
    abstract int getResult();
}

// Child class 1: Power
class Power extends Value {
    @Override
    int getResult() {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a; // calculating a^b
        }
        return result;
    }
}

// Child class 2: SearchDigit
class SearchDigit extends Value {
    @Override
    int getResult() {
        int num = a;
        int digit = b;

        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                return digit; // return the digit if found
            }
            num = num / 10;
        }
        return -1; // digit not found
    }
}

// Main class to test the functionality
public class AbstractValueMain {
    public static void main(String[] args) {

        // Object of Power class
        Power p = new Power();
        p.setValue(3, 4); // 3^4 = 81
        System.out.println("Power Result: " + p.getResult());

        // Object of SearchDigit class
        SearchDigit s = new SearchDigit();
        s.setValue(123456, 5);
        System.out.println("Search Digit Result: " + s.getResult()); // Digit 5 found → 5

        s.setValue(123456, 9);
        System.out.println("Search Digit Result: " + s.getResult()); // Digit 9 not found → -1
    }
}

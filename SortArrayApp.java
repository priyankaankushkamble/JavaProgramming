import java.util.*;
class SortArr
{
    int arr[];

    // Function to accept an array
    void setArray(int a[])
    {
        arr = a;
    }

    // Function to perform sorting and return the sorted array
    int[] getSortArray()
    {
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    // Swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class SortArrayApp
{
    public static void main(String[] args)
    {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = xyz.nextInt();
        }

        SortArr s = new SortArr();
        s.setArray(a);

        int sortedArray[] = s.getSortArray();

        System.out.println("Sorted Array:");
        for (int i = 0; i < sortedArray.length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
    }
}

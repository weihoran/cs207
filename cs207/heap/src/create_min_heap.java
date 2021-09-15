import java.util.Scanner;

public class create_min_heap {


    static void heapify(int array[], int size, int i)
    {
        int smallest = i;    // Initialize current node as largest
        int left = 2 * i + 1;   // position of left child in array = 2*i + 1
        int right = 2 * i + 2;   // position of right child in array = 2*i + 2


        if (left < size && array[left] < array[smallest])  // If left child is larger than root
            smallest = left;

        if (right < size && array[right] < array[smallest]) // If right child is larger than largest so far
            smallest = right;

        if (smallest != i) {         // If largest is not root swap it
            int swap = array[i];
            array[i] = array[smallest];
            array[smallest] = swap;

            heapify(array, size, smallest); // Recursively heapify the sub-tree
        }
    }

    static void buildHeap(int arr[], int n)
    {

        int startIdx = (n / 2) - 1; // Index of last non-leaf node

        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }


    static void printHeap(int arr[], int n)
    {
        System.out.println("Array representation of Heap:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = {6,9,7,3,8,1,2,5,4};
        int n = arr.length;
        buildHeap(arr, n);

        printHeap(arr, n);
    }
}








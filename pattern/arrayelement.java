//program to search an element in array

import java.util.Scanner; //importing scanner class for taking input

public class arrayelement {
    public static void main(String args[]) {

        // using scanner class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = scan.nextInt();

        // intialising array
        int arr[] = new int[n]; // n is the size of an array

        // taking input as a array elements from user
        System.out.println("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // which we have to find the element in the array
        System.out.println("Enter the element to search : ");
        int key = scan.nextInt();

        // for searching
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Element : " + key + " is found at the index " + i);
            }
        }

    }
}

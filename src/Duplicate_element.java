import java.util.Scanner;

public class Duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];             //declared array with user size

        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < arr.length; i++)    //loop to enter array element
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array is : "); //printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("Duplicate Elements are: ");
        for (int i = 0; i < arr.length; i++)
            {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[j] + " ");
            }
        }
    }
}

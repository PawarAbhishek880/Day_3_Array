import java.util.Scanner;

public class Reverse_Array {
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

        System.out.println("Array after reversing is: ");
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

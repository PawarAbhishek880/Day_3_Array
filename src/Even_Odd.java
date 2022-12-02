import java.util.Scanner;

public class Even_Odd {
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

        System.out.println("The Even Elements are...");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)             //Check whether even or not
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" ");


        System.out.println("The Odd Elements are...");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)            //check whether odd or not
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

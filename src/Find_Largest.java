
import java.util.Scanner;

public class Find_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : "); //enter size from user
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements in Array : "); //enter elements from user
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr)                //for each loop to print array elements
        {
            System.out.println(i);
        }

        int max = arr[0];               // stored 1st element in max

        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element in array is : " + max);
    }
}

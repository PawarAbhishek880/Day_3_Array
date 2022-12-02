import java.util.Scanner;

public class Find_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");   //enter size of array
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements in Array : ");   //loop to enter array
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr)        //for each loop to print array
        {
            System.out.println(i);
        }

        int min = arr[0];       //store 1st element in min
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] < min)    //for storing minimum element in min
                min = arr[i];
        }
        System.out.println("Largest element in array is : " + min);
    }
}

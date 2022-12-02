import java.util.Scanner;

public class Sec_Largest {
    public static void main(String[] args) {
        int temp;
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
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] >arr[j]) {      //swap elements if not in order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("");

        //print sorted array
        System.out.println("New array :  ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Second Largest:"+arr[n-2]);
        System.out.println("Smallest:"+arr[0]);

    }

}

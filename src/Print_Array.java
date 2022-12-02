import java.util.Scanner;

public class Print_Array {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = sc.nextInt();
        int array[] = new int [size];                   //creates array of that size

        System.out.println("Enter elements in array");  //loop to enter elements from user
        for(int i = 0 ; i < size ; i++)
        {
            array[i] = sc.nextInt();                    //taking input from user (array element)
        }

        System.out.println("Array elements are : ");    //loop for printing array
        for (int i = 0 ; i < size ; i++)
        {
            System.out.println(array[i]);
        }
    }
}

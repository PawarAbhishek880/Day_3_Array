import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        //define original array
        int [] arr = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp = 0;

        //print original array
        System.out.println("Original array: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Sort the array in ascending order using two for loops
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
        System.out.println("Array sorted in ascending order: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

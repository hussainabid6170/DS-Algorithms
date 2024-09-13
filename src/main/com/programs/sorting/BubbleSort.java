package programs.sorting;

import programs.utilties.UtilityClass;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String[] args ){

        int[] a = UtilityClass.randomArray(6, 10);
        System.out.println("Original Array: "+ Arrays.toString(a));
        bubbleSort(a, a.length);
    }

    public static void bubbleSort(int[] arr , int n){
        int j=1;
        while (j<n) {
            System.out.print(Arrays.toString(arr)+ " === ");
            for (int i = 0; i < n - j; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    System.out.print( Arrays.toString(arr));
                }
            }
            System.out.println( Arrays.toString(arr));
            j++;
        }
        System.out.println("Final Sorted Array :"+ Arrays.toString(arr));
    }
}

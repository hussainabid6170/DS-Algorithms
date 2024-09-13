package programs.sorting;

import java.util.Arrays;

import programs.utilties.UtilityClass;

public class InsertionSort {
    public static void main(String[] args ){

        int[] a = UtilityClass.randomArray(6, 10);
        System.out.println("Original Array: "+ Arrays.toString(a));
        insertionSort(a, a.length);

    }

    public static void insertionSort(int[] arr , int n){
        for (int i =1; i< n; i++  ){// it starts from index 1 and compares to the left
            int cValue = arr[i];
            int position = i;
            System.out.print( Arrays.toString(arr) +" == "+cValue+" == ");
            while(position>0 && arr[position-1] > cValue){
                arr[position] = arr[position-1];
                position--;
                System.out.print( Arrays.toString(arr) );
            }
            arr[position] =cValue;
            System.out.println( Arrays.toString(arr));
        }
        System.out.println("Final Sorted Array :"+ Arrays.toString(arr));
    }




}

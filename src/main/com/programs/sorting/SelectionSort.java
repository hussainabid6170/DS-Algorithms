package programs.sorting;

import programs.utilties.UtilityClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] arg ){
        int[] a = UtilityClass.randomArray(6, 10);
        System.out.println("Original Array: "+ Arrays.toString(a));
        selectionSort(a, a.length);
    }


    public static void selectionSort(int[] arr , int n){

        for(int i=0; i<n-1;i++ ){
            int positionElem = i;
            for(int j=i+1; j< n; j++ ){
                if(arr[j] < arr[positionElem]){
                    positionElem = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[positionElem];
            arr[positionElem] = temp;
            System.out.println( Arrays.toString(arr));
        }
        System.out.println("Final Sorted Array :"+ Arrays.toString(arr));
    }

}

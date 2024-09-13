package programs.searching;

import programs.utilties.UtilityClass;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main (String[] args){

        int[] A = UtilityClass.randomArray(6, 10);
        Arrays.sort(A);
        int searchKey = new Random().nextInt(0,5);

        System.out.println("Binary Search Iteration for Array :" + Arrays.toString(A) + " and Search Key "+ searchKey);
        int found = binarySearch_Iteration(A,A.length,searchKey);
        System.out.println("Result :"+ found);

        System.out.println("Binary Search Recursion for Array :" + Arrays.toString(A) + " and Search Key "+ searchKey);
        int found2 = binarySearch_Recursion(A,searchKey,0,A.length);
        System.out.println("Result :"+ found2);

    }


    public static int binarySearch_Iteration(int[] arr , int n , int searchKey){
        int L=0;
        int R = n;
        while(L<=R){
            int m = (L+R)/2;
            if(searchKey == arr[m] ){
                return m;
            }else if(searchKey < arr[m] ){
                R = m-1;
            }else if(searchKey > arr[m] ){
                L = m+1;
            }
        }
        return -1;
    }



    public static int binarySearch_Recursion(int[] arr , int searchKey, int L , int R){
        if(L > R){
            return -1;
        }
        int m = (L+R)/2;
        if(arr[m] == searchKey){
            return m;
        }else if(searchKey < arr[m]){
           return binarySearch_Recursion(arr, searchKey, L, m-1);
        }else if(searchKey > arr[m]){
            return binarySearch_Recursion(arr, searchKey, m+1, R);
        }
        return -1;
    }
}

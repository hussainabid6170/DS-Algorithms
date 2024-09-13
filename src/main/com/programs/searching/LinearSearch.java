package programs.searching;

import programs.utilties.UtilityClass;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = UtilityClass.randomArray(6, 10);
        int searKey = new Random().nextInt(0,5);
        System.out.println("Linear Search for Array :" + Arrays.toString(arr) + " and Search Key "+ searKey);
        int found = linearSearch(arr , arr.length, searKey);
        System.out.println("Result :" + found);

    }


    public static int linearSearch(int[] arr , int n , int searchKey){
            int index =0;
            while(index < n){
                if(arr[index] == searchKey){
                    return index;
                }
                index++;
            }
        return -1;
    }

}

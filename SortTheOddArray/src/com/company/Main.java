package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int [] myArray = new int[] {5, 3, 2, 8, 1, 4};
        System.out.println(Arrays.toString(sortArray(myArray)));
    }

    //int [] myArray = new int[] {10, 12, 7, 9, 3};
    //  sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
    public static int[] sortArray(int[] array) {


        //  boolean flag = false;
        // int temp = 0;
        int maxPosition = 0;
        //  int beforLastPos = 0;


//  [5, 3, 2, 8, 1, 4]
//  [3, 5, 2, 8, 1, 4]
//  [3, 5, 2, 8, 1, 4]
//  [3, 1, 2, 8, 5, 4]
        for(int j = 0; j < array.length; j++){

            int max = Integer.MIN_VALUE;

            for(int i = 0; i < array.length; i++){

                if(array[i] % 2 == 1){


                    if(array[i] > max){

                        max = array[i];
                        maxPosition  = i;
                        // flag = true;
                    }else{
                        //[1, 5, 2, 8, 3, 4]
                        if( max > array[i]){

                            array[maxPosition] = array[i];
                            array[i] = max;
                            maxPosition  = i;

                        }

                    }
                }


            }

        }



        return array;
    }
}
//max value is 5 for example
//[5, 3, 2, 8, 1, 4]
//if max > 5 (not)
//if(max  > 3 then flip (keep max position)  [3, 5, 2, 8, 1, 4]
//if max > 1 then flip (keep max position) [3, 1, 2,8, 5, 4]
//next iteration reset max flag to min constant
//if(3 > max then max = 3)
//if (3 > 3) not
//if(max (3) > 1 then flip [1,3,2,8,5,4]
//if Max(3) > 5 , not true keep position
//next iteration reset max flag to min constant
//max value is 1 for example
//if 1 > 1 not
//if 1 > 3, not
//if 1 > 5, not
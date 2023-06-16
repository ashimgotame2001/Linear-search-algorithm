import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr ={
                {10,21,31,34},
                {23,35,54,563,32},
                {12,36,65,76}
        };
        int tar = 36;
        System.out.println(Arrays.toString(search(arr,tar)));
        System.out.println(searchMax(arr));
    }


    static int[] search(int[][] arr , int tar){
        for(int row= 0; row<arr.length ; row++){
            for(int col= 0; col<arr[row].length ; col++){
                    if(arr[row][col] == tar) {
                        return new int[]{row, col};
                    }
            }
        }
      return new int[]{};
    }

    static int searchMax(int[][] arr ){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }


}

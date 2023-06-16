public class LinearSearch {
    public static void main(String[] args) {
         int[] array = {2,32,12,323,3221,23,232,212,323,1231,3211};
         int target= 121;
        System.out.println(search(array,target));

    }
    static int search(int[] arr ,int target){
      if(arr.length == 0){
          return Integer.MAX_VALUE;
      }
      for(int index = 0 ; index < arr.length; index++){
          int element = arr[index];
          if(element == target){
              return index;
          }
      };
       return Integer.MAX_VALUE;
    }
}

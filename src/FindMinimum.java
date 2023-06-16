public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {18,7,16,12,2,89, 1};
        System.out.println(finMin(arr));
    }

    static int finMin(int[] arr){
       int letMin = arr[0];
       for (int i = 1 ; i < arr.length;){
           if(arr[i] < letMin){
               letMin = arr[i];
           }
           i++;
       }
       return letMin;
    }
}

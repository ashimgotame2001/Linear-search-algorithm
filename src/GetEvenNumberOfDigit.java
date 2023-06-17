public class GetEvenNumberOfDigit {
    public static void main(String[] args) {
       int[] arr = {1,22,333,4444,55555,666666,7777777,88888888,999999999};
        System.out.println(getAllEvenNumberOfFromArray(arr));
//        System.out.println(count(443434));
    }


    static int getAllEvenNumberOfFromArray(int[] arr){
        int initial = 0;
       for(int a : arr){
           if(even(a)){
               initial++;
           }
       }
        return initial;
    }
    private static boolean even(int i) {
        int d = count(i);
        if (d % 2 != 0){
            return true;
        }
        return false;
    }
    static int count (int x){
        int co = 0;
        while (x>0){
            co++;
            x=x/10;
        }
        return co;
    }
}

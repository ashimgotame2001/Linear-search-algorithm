public class MaxWealthTuringQuestion {
    public static void main(String[] args) {
      int[][] as ={
                {10,21,31,74,10},
                {23,35,34,56,32},
        };
        System.out.println(getMaxWealth(as));
    }

    static int getMaxWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person<arr.length;person++){
            int sum =0 ;
            for (int acc =0;acc< arr[person].length;acc++){
                sum += arr[person][acc];
            }
          if(sum>ans){
              ans = sum;
          }

        }
        return ans;
    }
}

public class SearchInRange {
    public static void main(String[] args) {

    }
    static int search(int[] arr ,int target ,int start ,int end){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int index = start ; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        };
        return Integer.MAX_VALUE;
    }
}

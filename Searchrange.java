import java.util.Arrays;

public class Searchrange {
    public static void main(String[] args) {
        int[] arr={1,2,7,7,7,7,8,9};
        int target=7;
        int s=Search(arr,target,true);
        int e=Search(arr,target,false);
        System.out.print(s);
        System.out.print(e);
    }

    static int Search(int [] arr, int target,boolean Searchforstart){
        int start=0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (Searchforstart) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;
    }
}

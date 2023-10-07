public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,12,23,34,55,66,87,98,99};
        int target=87;
        int ans=Search(arr,target);
        System.out.println(ans);

    }
    static int Search(int [] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid =start+(end - start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}

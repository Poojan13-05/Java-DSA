public class floor{
    public static void main(String[] args) {
        int[] arr={1,12,23,34,55,66,87,98,99,105};
        int target=3;
        int ans;
        ans=binSearch(arr,target);
        System.out.println(ans);

    }
    static int binSearch(int [] arr, int target){
        int mid = 0;
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            mid =start+(end - start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else {
                return mid;
            }

        }
        return end;
    }

}

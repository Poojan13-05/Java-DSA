public class Findmin {
    public static void main(String[] args) {
        int[]nums={3,5,6,2,7,9};
        System.out.println(min(nums));

    }
    static int min(int[]arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }


        }
        return ans;
    }
}

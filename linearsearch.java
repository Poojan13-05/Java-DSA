public class linearsearch {
    public static void main(String[] args) {
        int[] nums={3,5,65,2,34,54,32,9};
        int target=34;
        int ans=Linear(nums,target);
        System.out.println(ans);

    }
    static int Linear(int arr[], int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            int element=arr[i];
            if (element==target){
                return i;
            }




        }
        return -1;
    }
}

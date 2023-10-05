public class EvenDigits {
    public static void main(String[] args) {
      int[] arr=  {12,345,2,6,7896};
        System.out.println(check(arr));

    }
    static int check (int[]arr){
         int count1=0;
        for (int j : arr) {
            if (even(j) % 2 == 0) {
                count1++;
            }

        }

        return count1;
    }
    static int even(int x){
        int count=0;
        while(x>0){
            count++;
            x=x/10;


        }

        return count;


    }
}

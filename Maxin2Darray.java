import java.util.Arrays;

public class Maxin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 67}, {78, 98, 77}, {43, 88, 62}


        };

        int ans= maxy(arr);
        System.out.println(ans);;
    }

    static int maxy(int[][] arr) {
        int max=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max=arr[row][col];

                }

            }

        }
        return max;
    }
}

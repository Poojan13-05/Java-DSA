public class Maxwealth {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,2,1}};

        System.out.println("The max wealth is "+maximumWealth(arr));

    }


     static public int maximumWealth(int[][] accounts) {

        int temp=0;

        for(int customer=0;customer<accounts.length;customer++){
            int max=0;
            for(int account=0;account<accounts[customer].length;account++){

                max+=accounts[customer][account];

            }

            if(temp<max){
                temp=max;


            }


        }
        return temp ;

    }

}

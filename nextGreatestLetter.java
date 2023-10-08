public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters={'a','c','g','j'};
        char target='g';
        char ans=letterSearch(letters,target);
        System.out.println(ans);


    }
    static char letterSearch(char [] letters, char target){
        int mid = 0;
        int start=0;
        int end = letters.length-1;
        while (start<=end){
            mid =start+(end - start)/2;
            if (target<letters[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
            }


        return letters[start % letters.length];
    }
}

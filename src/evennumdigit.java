public class evennumdigit {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] arr = {12, 325, 2, 6, 7896};
        int rcount = 0;
        for(int i : arr) {
            int x = arr[i];
            int count = 0;
            while (x > 0) {
                count++;
                x = x / 10;

            }
            if(count % 2 ==0 ){
                rcount++;
            }
            System.out.println(rcount);
        }
    }
}

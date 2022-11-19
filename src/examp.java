public class examp {
    public static void main(String[] args) {
        int[] arr = {12, 325, 2, 6, 796};
        int y = evendigit(arr);
        System.out.println(y);
    }
    public static int evendigit(int[] arr ){
        {
            int count = 0;
            int rcount = 0;
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i];
                while (x > 0) {
                    x = x / 10;
                    count++;

                }
                if (count % 2 == 0) {
                    rcount++;
                }
            }
            return rcount;
        }
    }
}

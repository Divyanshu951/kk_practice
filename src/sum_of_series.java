public class sum_of_series {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i] + temp;
        }
        System.out.println(temp);
    }
}

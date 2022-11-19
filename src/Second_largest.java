public class Second_largest {
    public static void main(String[] args) {
        int n = 384;
        int[] arr = new int[n];
        for(int j = 0; j < arr.length; j++){
            arr[j] = j + 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

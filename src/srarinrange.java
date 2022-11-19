public class srarinrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 2;
        int x = 67777;
        int y = search9(arr, x, n);
        if(y == -1){
            System.out.println("element does not exist");
        }else{
            System.out.println(y);
        }
    }
    public static int search9(int[] arr, int x, int n){
        if(arr.length == 0){
            return -1;
        } else {
            for(int i = 1; i <= n; i++){
                if(i == x){
                    return i;
                }
            }
        }
        return -1;
    }
}

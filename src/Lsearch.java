import java.util.Arrays;

public class Lsearch {
    public static void main(String[] args) {
        int[] arr = new int[1000001];
        for(int j = 0; j < arr.length; j++){
            arr[j] = j;
        }
        int h = 10000;
        int a = Lsearch(arr,h);
        if(a == -1){
            System.out.println("the element does not exist in the array");
        }else{
            System.out.println(a);
        }
    }
    public static int Lsearch(int[] arr,int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]==x){
                return i;
            }
        }return -1;
    }
}


public class max {
    public static void main(String[] args) {
        int[] arr = {71,2,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int mv = arr[0];
     for(int i = 0; i < arr.length; i++){
         if(arr[i] > mv){
             mv = arr[i];
         }
     }
     return mv;
    }
}

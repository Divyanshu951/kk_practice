import java.util.Scanner;

public class Solution {
    public static boolean checkSequence(String a, String b) {

        if(b.length() == 0){
            return false;
        }

        if (a.charAt(0) == b.charAt(0)){
            a = a.substring(1);
            b = b.substring(1);

        }else{
            a = a.substring(1);
        }

        boolean ans = checkSequence(a,b);

        return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String large = s.nextLine();
        String small = s.nextLine();

        System.out.println(Solution.checkSequence(large, small));
    }
}
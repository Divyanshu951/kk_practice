//https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_509.java

public class Fibonacci_number {
    public static void main(String[] args) {
       int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(febrec(i));
        }
    }
    //function to print n factional number
    public static void fab(int n){
        //without recursion
        int first = 0,sec = 1;
        int counter = 0;
        while(counter < n){
            System.out.print(first + " ");
            int num3 = first + sec;
            first = sec;
            sec = num3;
            counter++;
        }
    }
    //using recursion
    public static int febrec(int n){
        if(n <= 1) return n;
        return febrec(n - 1) + febrec(n - 2);
    }
}

public class recursion {
    public static void main(String[] args) {
        print(1);
//        p1(1);
//    }
//
//    public static void p1(int n) {
//        System.out.println(n);
//        p2(2);
//    }
//
//    public static void p2(int n) {
//        System.out.println(n);
//        p3(3);
//    }
//
//    public static void p3(int n) {
//        System.out.println(n);
//        p4(4);
//    }
//
//    public static void p4(int n) {
//        System.out.println(n);
//        p5(5);
//
//    }
//
//    public static void p5(int n) {
//        System.out.println(n);
//    }



    //recursive way
    }

    public static void print(int n) {
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

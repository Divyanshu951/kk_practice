import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String str = "abusdgfdrhgccba";
        int ans = pal(str);
        if(ans == -1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
//        // Strings are a sequence of characters
//        //Every thing which starts with a capital later is a class
//        //String are mutable, so they can be changed
//        String str = "String";//both str and s point to the same pool
//        String s = new String("String");
//        System.out.println();
//        System.out.println(str);
//
//        //cpmparisoin of string
//        // == method = checks if refrence variable are pointing to same oobjecrs
//        String n = new String("String");//to force the jvm to create a new pool for the variable
//        System.out.println(str == n);// to confirm that they point to same pool
//        s = "Not String";// here the value of the string is not changes a new pool is created
//        System.out.println(s);
//        System.out.println(str.equals(s));
//        System.out.println(str.charAt(0));
//
//        //outpt
//        System.out.println(56);
//        System.out.println();
//        float a = 7.232123f;
//        System.out.printf("Print %.2f",a); // placeholder
//        System.out.printf("Hello my name is %s and in my from %s","div","hyd");
//        System.out.println();
//
//        StringBuilder series = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            series.append(ch);
//        }
//        System.out.println(series.toString());
//
//        //mrhods
        //palindrome
    }
        public static int pal(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(s != end) {
                return 1;
            }
        }
        return -1;

    }
}

public class string {
    public static void main(String[] args) {
        // Strings are a sequence of characters
        //Every thing which starts with a capital later is a class
        //String are mutable, so they can be changed
        String str = "String";//both str and s point to the same pool
        String s = new String("String");
        System.out.println();
        System.out.println(str);

        //cpmparisoin of string
        // == method = checks if refrence variable are pointing to same oobjecrs
        String n = new String("String");//to force the jvm to create a new pool for the variable
        System.out.println(str == n);// to confirm that they point to same pool
        s = "Not String";// here the value of the string is not changes a new pool is created
        System.out.println(s);
        System.out.println(str.equals(s));
        System.out.println(str.charAt(0));

        //outpt
        System.out.println(56);
        System.out.println();
        float a = 7.232123f;
        System.out.printf("Print %.2f",a);
        System.out.printf("Hello my name is %s and in my from %s","div","hyd");
        System.out.println();


        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }
}

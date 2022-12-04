public class string {
    public static void main(String[] args) {
        // Strings are a sequence of characters
        //Every thing which starts with a capital later is a class
        //String are mutable, so they can be changed
        String str = "String";//both str and s point to the same pool
        String s = "String";
        System.out.println(s);
        System.out.println(str);
        //cpmparisoin of string
        // == method = checks if refrence variable are pointing to same oobjecrs
        String n = new String("String");//to force the jvm to create a new pool for the variable
        System.out.println(str == n);// to confirm that they point to same pool
        s = "Not String";// here the value of the string is not changes a new pool is created
        System.out.println(s);
        System.out.println(str.equals(s));



    }
}

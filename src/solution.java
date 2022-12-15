import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        System.out.println(list);
        list.contains(1);
        System.out.println(list.contains(12));
        list.set(0,111);
        System.out.println(list);

        }
}
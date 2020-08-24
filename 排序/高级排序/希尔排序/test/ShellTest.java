package test;

import sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5, 5, 6, 7, 8, 9]
    }
}

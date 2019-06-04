package kulo.sgg.utils;
import java.util.Arrays;

public class ArrayListKL {

    public static void main(String[] args) {
//        Array testArray = new Array(10);
        int test1[] = {1, 2, 3, 4, 5, 6, 9, 7, 8};
        int test2[] = {5, 5, 5, 5};

        System.out.println("----------start system.arrycopy-------------");
        System.out.println("test1:" + Arrays.toString(test1));
        System.out.println("test2:" + Arrays.toString(test2));
        System.arraycopy(test1, 2, test2, 0, 2);
        System.out.println("test1:" + Arrays.toString(test1));
        System.out.println("test2:" + Arrays.toString(test2));

        System.out.println("----------start arrays.copyof-------------");
        test2 = Arrays.copyOf(test1, 4);
        System.out.println("test1:" + Arrays.toString(test1));
        System.out.println("test2:" + Arrays.toString(test2));
    }
}

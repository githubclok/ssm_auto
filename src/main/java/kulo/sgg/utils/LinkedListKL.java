package kulo.sgg.utils;

import kulo.sgg.entity.RmDealerInfoEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListKL {
    public static void main(String[] args) {
//        LinkedList<RmDealerInfoEntity> list = new LinkedList<>();
//        LinkedList<RmDealerInfoEntity> list2 = new LinkedList<>(list);


        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            array.add(i);
            linked.add(i);
        }
        System.out.println(insertInMiddleTime(array));
        System.out.println(insertInMiddleTime(linked));
    }

    //插入数据
    public static long insertInMiddleTime(List<Integer> list) {
        /*
         * 插入的数据量和插入的位置是决定两者性能的主要方面，
         * 我们可以通过修改这两个数据，来测试两者的性能
         */
        long num = 100000; //表示要插入的数据量
        int index = 5000; //表示从哪个位置插入
        long time = System.currentTimeMillis();
        for (int i = 1; i < num; i++) {
            list.add(index, i);
        }
        return System.currentTimeMillis() - time;

    }

    //插入数据
    public static long insertAtLastTime(List<Integer> list) {
        /*
         * 插入的数据量和插入的位置是决定两者性能的主要方面，
         * 我们可以通过修改这两个数据，来测试两者的性能
         */
        long num = 1000000; //表示要插入的数据量
        int index = 700; //表示从哪个位置插入
        long time = System.currentTimeMillis();
        for (int i = 1; i < num; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - time;

    }

    //查找数据
    public static long getTime(List<Integer> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = Collections.binarySearch(list, list.get(i));
            if (index != i) {
                System.out.println("ERROR!");
            }
        }
        return System.currentTimeMillis() - time;
    }
}

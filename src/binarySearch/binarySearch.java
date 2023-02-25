package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binarySearch {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index2 = Arrays.binarySearch(array, 5);
        System.out.println(index2);

    }
}

package daliyCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main24 {
    static int[] base = {7,6,1,2,3,4,5};
    static int[] sample = {1,200};

    public static void main(String[] args) {
        System.out.println(isSubsetOf(base, sample));
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> intList
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!intList.contains(i)) {
                return false;
            }
        }
        return true;
    }
}


package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        List<ListNode> mergedList = new ArrayList<>();
        mergedList.add(list1);
        mergedList.add(list2);
        mergedList.stream().sorted()
                .toList();

        return null;
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;

        if (n == 2) return 2;

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }

    // Task #1
    public boolean isPalindromeNumber(int x) {
        String y = Integer.toString(x);
        StringBuilder builder = new StringBuilder(y);
        StringBuilder b = builder.reverse();

        return y.equals(b.toString());
    }
}

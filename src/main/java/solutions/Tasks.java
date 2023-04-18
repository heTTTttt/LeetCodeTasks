package solutions;

import java.util.ArrayList;
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

    // Task #2
    // Метод визначає скільки є можливих варіантів здолати сходи з n-сходинками.
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
    // Метод виявляє чи є число паліндромом.
    public boolean isPalindromeNumber(int x) {
        String y = Integer.toString(x);
        StringBuilder builder = new StringBuilder(y);
        StringBuilder b = builder.reverse();

        return y.equals(b.toString());
    }
    // Task #3
    // Метод перетворює римські числові значення на арабські(звичайні).
    public int romanToInteger(String s) {

        int preSymbol = 0, sum = 0;
        char ch = 0;


        for (int i = 0; i < s.length(); i++) {
            preSymbol = ch;
            ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if (preSymbol == 'I')
                        sum = sum + 3;
                    else
                        sum = sum + 5;
                    break;
                case 'X':
                    if (preSymbol == 'I')
                        sum = sum + 8;
                    else
                        sum = sum + 10;
                    break;
                case 'L':
                    if (preSymbol == 'X')
                        sum = sum + 30;
                    else
                        sum = sum + 50;
                    break;
                case 'C':
                    if (preSymbol == 'X')
                        sum = sum + 80;
                    else
                        sum = sum + 100;
                    break;
                case 'D':
                    if (preSymbol == 'C')
                        sum = sum + 300;
                    else
                        sum = sum + 500;
                    break;
                case 'M':
                    if (preSymbol == 'C')
                        sum = sum + 800;
                    else
                        sum = sum + 1000;
                default:
                    break;
            }
        }

        return sum;
    }
}

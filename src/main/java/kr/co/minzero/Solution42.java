package kr.co.minzero;

import java.util.*;

public class Solution42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int maxLength = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            set.add(num);
            if(m == deque.size()) {
                maxLength = Math.max(set.size(), maxLength);
                int first = deque.removeFirst();
                if(!deque.contains(first))
                    set.remove(first);
            }
        }

        System.out.println(maxLength);
    }
}

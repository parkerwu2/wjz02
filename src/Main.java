import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Main {
    private int diff(int a, int b) {
        String l = Integer.toBinaryString(a);
        String r = Integer.toBinaryString(b);
        if (l.length() < 4) {
            while (l.length() != 4) {
                l = "0" + l;
            }
        }
        if (r.length() < 4) {
            while (r.length() != 4) {
                r = "0" + r;
            }
        }
        String l1 = "";
        String r1 = "";
        if (l.length() > 4) {
            l1 = l.substring(l.length() - 4);
        } else {
            l1 = l;
        }
        if (r.length() > 4) {
            r1 = r.substring(r.length() - 4);
        } else {
            r1 = r;
        }
        int d = 0;
        for (int i = 0; i < 4; i++) {
            if (l1.charAt(i) != r1.charAt(i)) {
                d++;
            }
        }
        return d;
    }
    public int totalHammingDistance(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                    sum += diff(nums[i], nums[j]);
            }
        }
        return sum;
    }
    public static void A() {
    }


    public static void main(String[] args) {
//        int r = new Main().totalHammingDistance(new int[]{1337, 7331});
//        System.out.println(r);
            AtomicInteger
    }
}

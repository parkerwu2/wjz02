import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
class A {

}
public class Main {

    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int[][] f = new int[5][5];
//        m[0][0] = 4;
//        m[0][1] = 5;
//        m[0][2] = 2;
//        m[0][3] = 6;
//        m[0][4] = 5;
        f[0][0] = 12;
        f[0][1] = 7;
        f[0][2] = 13;
        f[0][3] = 24;
        f[0][4] = 11;
        m[1][0] = 6;
        m[1][1] = 14;
        m[1][2] = 15;
        m[1][3] = 8;
        m[2][0] = 12;
        m[2][1] = 7;
        m[2][2] = 26;
        m[3][0] = 11;
        m[3][1] = 8;
        m[4][0] = 13;
        int n = 4;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[i - 1][j + 1]) + m[i][j];
                System.out.println("f[" + i + "][" + j + "]=" + f[i][j]);
            }
            n--;
        }
        System.out.println(f[4][0]);
    }
}

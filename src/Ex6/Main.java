package Ex6;

/**
 * Created by Administrator on 2017/2/5.
 */
//求一个java程序（数塔问题）
//        、数塔问题(tower.pas)
//        设有一个三角形的数塔,如下图所示.顶点结点称为根结点,每个结点有一个整数数值.从顶点出发,在每一结点可以选择向左走或是向右走,一起走到底层,要求找出一条路径,使路径上的值最大.
//        【样例输入】tower.in
//        5 {数塔层数}
//        13
//        11 8
//        12 7 26
//        6 14 15 8
//        12 7 13 24 11
//        【样例输出】tower.out
//        max=86

    // 状态转移方程 f[i][j] = max(f[i-1][j], f[i-1][j+1]) + m[i][j];
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

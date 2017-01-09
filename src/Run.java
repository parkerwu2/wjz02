/**
 * Created by Administrator on 2016/11/24.
 */
enum 名车 {
   宾利, 奔驰, 宝马, 大众;
}
public class Run {
    public static void main(String[] args) {
        名车 mc = 名车.宾利;
        switch (mc) {
            case 宾利:
                System.out.println("你最有钱");
                break;
            case 大众:
                System.out.println("你是神车");
                break;
            default:
                break;
        }
    }
}

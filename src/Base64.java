import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class Data {
    public String userId;
    public String mobile;

    public Data(String u, String m) {
        userId = u;
        mobile = m;
    }
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Data other = (Data)obj;
        if (this.userId.equals(other.userId)
                || this.mobile.equals(other.mobile)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.userId + "#" + this.mobile;
    }
}
/**
 * Created by Administrator on 2017/2/23.
 */
public class Base64 {
    public static void main(String[] args) throws IOException {
        Data a = new Data("897552032", "18900000001");
        Data b = new Data("897552032", "18900000002");
        Data c = new Data("897552033", "18900000001");
        Data d = new Data("897552034", "18900000005");
        Data e = new Data("897552036", "18900000007");
        Set<Data> s = new HashSet<>();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        s.add(e);
        for (Data dd : s) {
            System.out.println(dd);
        }
    }
}

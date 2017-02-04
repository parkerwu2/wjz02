package dynamicproxy;

/**
 * Created by Administrator on 2017/2/4.
 */
public class PeopleSay implements Say {
    @Override
    public void saywords(String words) {
        System.out.println("people say:" + words);
    }
}

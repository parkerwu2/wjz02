

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jazz on 2016/10/31.
 */
public class TestHttp {

    public static void main(String[] args) throws Exception {
        List<String> urlList = getUrlList();

//        if (urlList == null || urlList.size() != 1350) {
//            System.out.println("数量错误,应该有1350条记录，实际有：" + urlList.size());
//            return;
//        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\result3.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("E:\\resulttoo3.txt"));
        int okcnt = 0;
        int falicnt = 0;
        int excepcnt = 0;
        for (int i = 0; i < urlList.size(); i++) {
            String url = urlList.get(i);
            try {
                String res = HttpUtils.sendPost(url, null);
                if (res != null && res.contains("\"resultCode\":0")) {
                    System.out.println("bind success i:" + i + ",res:" + res);
                    writer.write("bind success i:" + i + ",res:" + res);
                    writer.newLine();
                    okcnt++;
                    Thread.sleep(500);
                }else {
                    if (res.contains("\"resultCode\":1")) {
                        writer2.write("===================================bind fail i:" + i + ",url:" + url + ", res:" + res);
                        writer2.newLine();
                    }
                    System.out.println("===================================bind fail i:" + i + ",url:" + url + ", res:" + res);
                    writer.write("===================================bind fail i:" + i + ",url:" + url + ", res:" + res);
                    writer.newLine();
                    falicnt++;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("********************************************bind exception,i:" + i + ",url:" + url);
                writer.write("********************************************bind exception,i:" + i + ",url:" + url);
                writer.newLine();
                excepcnt++;
            }
        }
        System.out.println("PROCESS FINISH okcnt:" + okcnt + ",failcnt:" + falicnt + ",excepcnt:" + excepcnt + ",allcnt:" + (okcnt + falicnt + excepcnt));
        writer.write("PROCESS FINISH okcnt:" + okcnt + ",failcnt:" + falicnt + ",excepcnt:" + excepcnt + ",allcnt:" + (okcnt + falicnt + excepcnt));
        writer.newLine();
        if (writer != null) {
            writer.flush();
            writer.close();
            writer2.flush();
            writer2.close();
        }

    }

    private static List<String> getUrlList() throws Exception{

        BufferedReader reader = null;
        List<String> urlList = new ArrayList<String>(1400);
        try {
            reader = new BufferedReader(new FileReader(new File("E:\\ba.txt")));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String url = "http://121.40.199.147/common/user/call/bindVirtualPhone.rest?param={%22agentId%22:"+line+",%22bindType%22:7,%22operatorId%22:-1}";
                urlList.add(url);
            }
        }finally {
            if (reader != null) {
                reader.close();
            }
        }

        return urlList;
    }
}

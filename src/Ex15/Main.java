package Ex15;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 会议安排系统V0.1
 * Created by 吴吉 on 2017/3/1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<String> roomName = new ArrayList<>();
        ArrayList<Long> rooms = new ArrayList<>();
        while (true) {
            String line = cin.nextLine();
            String[] sLine = line.split(" ");
            String firstWord = sLine[0];
            if (firstWord.equals("退出")) {
                break;
            } else if (firstWord.equals("安排")) { //开始安排
                String[] times = sLine[1].split("-");
                long l = 0;
                String start = times[0];
                String end = times[1];
                l += time2bit(end) - time2bit(start);
                boolean find = false;
                System.out.print("会议:" + sLine[1]+" ");
                ArrayList<String> foundroom = new ArrayList<>();
                for (int index=0 ; index<rooms.size();index++) {
                    long room = rooms.get(index);
                    if ((room | l) == room + l) {
                        find = true;
                        foundroom.add(roomName.get(index));
                    }
                }
                if (find){
                    System.out.print("可以被安排在:");
                    for (String name:foundroom) {
                        System.out.print(name+" ");
                    }
                    System.out.println();
                }else {
                    System.out.print("无法安排");
                }
            } else {  // 录入会议室安排
                roomName.add(firstWord);
                long l = 0;
                for (String meeting : sLine) {
                    if (meeting.equals(firstWord)) {
                        continue;
                    }
                    String[] times = meeting.split("-");
                    String start = times[0];
                    String end = times[1];
                    l += time2bit(end) - time2bit(start);
                }
                rooms.add(l);
            }
        }
    }

    /**
     * time2bit
     * 每半小时算一格，放在long对应的bit上
     * 00:00 1
     * 00:30 10
     * 01:00 100
     * 01:30 1000
     * 02:00 10000
     */
    private static long time2bit(String time) {
        String[] ss = time.split(":");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]) / 30;
        long result = 1;
        result = result << (a * 2 + b);
        return result;
    }
}

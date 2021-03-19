package PTA_L1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * :
 * Alke
 * 2020-11-07 9:38
 */

public class _5 {
    //未超时版本
    public static void main(String[] args) throws IOException {
        // 使用BufferReader 快速读取
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        // 读取一行中的一个整型数字
        int N = Integer.parseInt(bReader.readLine());
        HashMap<String, String[]> map = new HashMap<String, String[]>();
        while (N-- > 0) {
            // 读取一行，用空格分割
            String[] line = bReader.readLine().split(" ");
            String[] data = new String[2];
            data[0] = line[0];
            data[1] = line[2];
            // 将数据存入map
            map.put(line[1], data);
        }
        int M = Integer.parseInt(bReader.readLine());
        // 用空格分割一行中带查询的号码
        String[] query = bReader.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            String[] data = map.get(query[i]);
            System.out.println(data[0] + " " + data[1]);
        }
    }
}
//public class _5 {
//    //超时
//    static Map<Integer,String> map1 = new HashMap<>();
//    static Map<Integer,Integer> map2 = new HashMap<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            String s = sc.next();
//            int shi = sc.nextInt();
//            map1.put(shi,s);//试 号
//            map2.put(shi,sc.nextInt());//试 考
//        }
//        int m = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i:list){
//            System.out.println(map1.get(i)+" "+map2.get(i));
//        }
//    }
//}

//public class _5 {
//    static Map<String,String> map1 = new HashMap<>(); //shi hao
//    static Map<String,String> map2 = new HashMap<>(); //shi kao
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            String q[] = br.readLine().split(" ");
//            map1.put(q[1],q[0]);
//            map2.put(q[1],q[2]);
//        }
//        int m = Integer.parseInt(br.readLine());
//        String asd[] = br.readLine().split(" ");
//        for (String s:asd){
//           System.out.println(map1.get(s)+" "+map2.get(s));
//        }
//    }
//}
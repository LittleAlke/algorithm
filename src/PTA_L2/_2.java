package PTA_L2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * :
 * Alke
 * 2020-11-27 17:29
 */
public class _2 {
    static class Node {
        String ad;
        String value;
        String Next;

        Node(String ad, String value, String Next) {
            this.ad = ad;
            this.value = value;
            this.Next = Next;
        }

        @Override
        public String toString() {
            return ad + " " + value + " " + Next;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getNext() {
            return Next;
        }

        public void setNext(String next) {
            Next = next;
        }

    }

    static Map<String, Node> map = new HashMap<>();
    static Map<String, Node> map2 = new HashMap<>();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" +");
        String root = s1[0];
        String rootC = "-1";
        String root1 = root;
        String root2 = "-2";
        int n = Integer.parseInt(s1[1]);
        for (int i = 0; i < n; i++) {
            String[] s = reader.readLine().split(" +");
            map.put(s[0], new Node(s[0], s[1], s[2]));
        }
        while (!(root1.equals("-1"))) {
            Node node = map.get(root1);//取出
            if ((node.Next).equals("-1")) break;
            int abs = Math.abs(Integer.parseInt(node.value));
            set.add(abs);
            Node next = map.get(node.Next);
            int absNext = Math.abs(Integer.parseInt(next.value));
            if (set.contains(absNext)) {
                node.setNext(next.Next);
                if (root2.equals("-2")) {
                    rootC = next.ad;
                    root2 = next.ad;
                } else {
                    root2 = map.get(root2).Next;
                }
                Node n2 = map.get(root2);
                if (!(n2.Next.equals("-1")))
                    n2.setNext(map.get(n2.Next).Next);
            } else {
                root1 = next.ad;
                set.add(absNext);
            }
        }
        while (!(root.equals("-1"))) {
            System.out.println(map.get(root));
            root = map.get(root).Next;
        }
        while (!(rootC.equals("-1"))) {
            System.out.println(map.get(rootC));
            rootC = map.get(rootC).Next;
        }


    }
}

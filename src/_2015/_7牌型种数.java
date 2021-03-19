package _2015;

/**
 * :小明被劫持到X赌城，被迫与其他3人玩牌。
 * 一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
 * 这时，小明脑子里突然冒出一个问题：
 * 如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 * <p>
 * 请填写该整数，不要填写任何多余的内容或说明文字。
 * Alke
 * 2020-10-11 15:44
 */
public class _7牌型种数 {
    static int sum = 0;

    public static void main(String[] args) {
        f(0, 0);
        System.out.println(sum);
    }

    private static void f(int cut, int type) {
        if (cut > 13 || type > 13) return;
        if (cut == 13 && type == 13) {
            sum++;
            return;
        }
        for (int i = 0; i < 5; i++) {
            f(cut + i, type + 1);
        }
    }

}

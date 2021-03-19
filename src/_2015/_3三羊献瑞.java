package _2015;

/**
 * :观察下面的加法算式：
 * <p>
 * 祥 瑞 生 辉
 * +   三 羊 献 瑞
 * -------------------//  三=1，祥=9，羊=0，生=瑞+1，生+献>9
 * 三 羊 生 瑞 气
 * <p>
 * (如果有对齐问题，可以参看【图1.jpg】)
 * <p>
 * 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
 * <p>
 * 请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
 * Alke
 * 2020-10-08 18:08
 */
public class _3三羊献瑞 {
    public static void main(String[] args) {
        for (int rui = 2; rui < 9; rui++) {
            int sheng = rui + 1;
            for (int hui = 2; hui < 9; hui++) {
                if (hui == sheng || hui == rui) continue;
                for (int xian = 2; xian < 9; xian++) {
                    if (xian == hui || xian == rui || xian == sheng) continue;
                    for (int qi = 2; qi < 9; qi++) {
                        if (qi == xian || qi == hui || qi == rui || qi == sheng) continue;
                        if (9000 + rui * 100 + sheng * 10 + hui + 1000 + 0 + xian * 10 + rui == 10000 + 0 + sheng * 100 + rui * 10 + qi) {
                            System.out.printf(" %d%d%d%d\n", 9, rui, sheng, hui);
                            System.out.printf(" %d%d%d%d\n", 1, 0, xian, rui);
                            System.out.printf("%d%d%d%d%d", 1, 0, sheng, rui, qi);
                            return;
                        }

                    }

                }
            }
        }


    }
}

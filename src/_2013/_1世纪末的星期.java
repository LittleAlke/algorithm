package _2013;

import java.util.Calendar;

/**
 * :
 * 曾有邪教称1999年12月31日是世界末日。当然该谣言已经不攻自破。
 * <p>
 * 还有人称今后的某个世纪末的12月31日，如果是星期一则会....
 * <p>
 * 有趣的是，任何一个世纪末的年份的12月31日都不可能是星期一!!
 * <p>
 * 于是，“谣言制造商”又修改为星期日......
 * <p>
 * 1999年的12月31日是星期五，请问：未来哪一个离我们最近的一个世纪末年（即xx99年）的12月31日正好是星期天（即星期日）？
 * <p>
 * 请回答该年份（只写这个4位整数，不要写12月31等多余信息）
 * Alke
 * 2020-09-26 22:01
 */
public class _1世纪末的星期 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int i = 1999; i < 10000; i += 100) {
            calendar.set(i, 11, 31);//month从零开始
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {//周日为一
                System.out.println(i);
                break;
            }
        }
    }
}

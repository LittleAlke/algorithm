package work.day1;

/**
 * 就近原则
 * ●变量的分类
 * ●成员变量:类变量、实例变量
 * ●局部变量
 * ●非静态代码块的执行:每次创建实例对象都会执行
 * ●方法的调用规则:调用一-次执行- -次
 * Alke
 * 2021-03-07 16:19
 */
public class Test3 {
    static int s;
    int i;
    int j;
    {
        int i = 1;
        i++;
        j++;
        s++;
    }
    public void test(int j){
        j++;
        i++;
        s++;
    }
    public static void main(String[] args) {
        Test3 t1 = new Test3();
        Test3 t2 = new Test3();
        t1.test(10);
        t1.test(20);
        t2.test(30);
        System.out.println(t1.i+","+t1.j+","+t1.s);
        System.out.println(t2.i+","+t2.j+","+t2.s);
    }
}

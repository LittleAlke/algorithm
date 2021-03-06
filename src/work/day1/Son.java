package work.day1;

/**
 * 初始化子类需要先初始化父类
 * (1) j = method();
 * (2) 子类的静态代码块
 *
 * 类初始化：
 *   先初始化父类：5 1
 *   再初始化子类：10 6
 *
 * 子类的实例初始化<init>：
 * （1）super()（最前）即父类的实例初始化 9 3 2
 * （2）i = test(); 9
 * （3）子类的非静态代码块 8
 * （4）子类的无参构造（最后） 7
 *  因为创建了两个son对象，因此实例化方法<init>执行了两次
 *
 *
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.print("(6)");
    }
    Son(){
//        super(); 写与不写都存在，子类构造器中一定会调用父类的构造器
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }
    public int test(){
        System.out.print("(9)");
        return 1;
    }
    public static int method(){
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}

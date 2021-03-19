package work.singleton;


/**
 * 饿汉式  静态代码块
 * 线程安全，因为类加载器加载静态方法和属性
 * Alke
 * 2021-03-07 9:33
 */
public class Singleton_Hungry3 {
    private static  Singleton_Hungry3 instance = new Singleton_Hungry3();
    private Singleton_Hungry3(){
    }
    public static Singleton_Hungry3 getInstance(){
        return instance;
    }

}

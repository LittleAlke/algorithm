package work.singleton;

/**
 * 饿汉式  直接实例化
 * Alke
 * 2021-03-07 9:33
 */
public class Singleton_Hungry1 {
    public static final Singleton_Hungry1 INSTANCE = new Singleton_Hungry1();
    private Singleton_Hungry1(){

    }


}

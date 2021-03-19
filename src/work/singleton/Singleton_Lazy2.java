package work.singleton;

/**
 * 懒汉式 线程安全
 * Alke
 * 2021-03-07 10:04
 */
public class Singleton_Lazy2 {
    private static Singleton_Lazy2 instance;
    private Singleton_Lazy2(){}
    public static Singleton_Lazy2 getInstance(){
        if (instance == null){
            synchronized (Singleton_Lazy2.class){
                if (instance == null){
                    instance = new Singleton_Lazy2();
                }
                return instance;
            }
        }
        return instance;
    }
}

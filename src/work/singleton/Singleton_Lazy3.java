package work.singleton;

/**
 * 懒汉式 线程安全
 * 在内部类被加载时才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化的
 * 因为是在内部类加载和初始化时创建的，所以是线程安全的
 * Alke
 * 2021-03-07 10:04
 */
public class Singleton_Lazy3 {
    private Singleton_Lazy3(){
    }

    private static class Inner{
        private static final Singleton_Lazy3 INSTANCE = new Singleton_Lazy3();
    }

    public static Singleton_Lazy3 getInstance(){
        return Inner.INSTANCE;
    }

}

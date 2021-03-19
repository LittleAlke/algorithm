package work.singleton;

/**
 * :
 * Alke
 * 2021-03-11 14:39
 */
public class Lazy {
    private Lazy(){
        System.out.println(Thread.currentThread().getName()+"我是单例模式！！！");
    }
    private static class Inner{
        private static final Lazy lazy = new Lazy();
    }
    public static Lazy getInstance(){
        return Inner.lazy;
    }

    public static void main(String[] args) {
//        System.out.println(Lazy.getInstance()==Lazy.getInstance());
//        System.out.println(Lazy.getInstance()==Lazy.getInstance());
//        System.out.println(Lazy.getInstance()==Lazy.getInstance());
//        System.out.println(Lazy.getInstance()==Lazy.getInstance());
        Lazy lazy = Lazy.getInstance();
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(lazy==Lazy.getInstance());
            },String.valueOf(i)).start();
        }
    }
}



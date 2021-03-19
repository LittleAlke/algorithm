package work.singleton;

/**
 * :
 * Alke
 * 2021-03-07 9:44
 */
public class SingletonTest {
    public static void main(String[] args) {
//        Singleton_Hungry1 s = Singleton_Hungry1.INSTANCE;
//        Singleton_Hungry1 s2 = Singleton_Hungry1.INSTANCE;

//        Singleton_Hungry3 s = Singleton_Hungry3.getInstance();
//        Singleton_Hungry3 s2 = Singleton_Hungry3.getInstance();

        Singleton_Lazy1 s = Singleton_Lazy1.getInstance();
        Singleton_Lazy1 s2 = Singleton_Lazy1.getInstance();
        System.out.println(s);
        System.out.println(s2);

    }
}

package work.singleton;

/**
 * :
 * Alke
 * 2021-03-11 14:37
 */
public class Hungry {
    private static Hungry hungry = new Hungry();
    private Hungry(){
        System.out.println("!!!");
    }
    public static Hungry getHungry(){
        return hungry;
    }

    public static void main(String[] args) {
//        System.out.println(Hungry.getHungry()==Hungry.getHungry());
//        System.out.println(Hungry.getHungry()==Hungry.getHungry());
//        System.out.println(Hungry.getHungry()==Hungry.getHungry());
//        System.out.println(Hungry.getHungry()==Hungry.getHungry());
        Hungry hungry = Hungry.getHungry();
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(hungry==Hungry.getHungry());
            },String.valueOf(i)).start();
        }
    }
}

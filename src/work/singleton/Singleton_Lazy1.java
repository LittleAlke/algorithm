package work.singleton;

import java.io.Externalizable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 懒汉式 线程不安全
 * Alke
 * 2021-03-07 10:04
 */
public class Singleton_Lazy1 {
    private static Singleton_Lazy1 instance;
    private Singleton_Lazy1(){}
    public static Singleton_Lazy1 getInstance(){
        if (instance == null){
            instance = new Singleton_Lazy1();
        }
        return instance;
    }
}

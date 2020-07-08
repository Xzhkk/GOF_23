/**
 * 饿汉式
 */

public class Singleton_01 {
    private static  Singleton_01 uniqueInstance =new Singleton_01();
    private Singleton_01(){}

    public static Singleton_01 getInstance(){
        return uniqueInstance;
    }

}

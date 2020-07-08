/**
 * 双重检查加锁
 */
public class Singleton_02 {
    private volatile static  Singleton_02 uniqueInstance;
    private Singleton_02(){}
    public static Singleton_02 getInstance(){
        if(uniqueInstance==null){
            synchronized (Singleton_02.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton_02();
                }
            }
        }
        return uniqueInstance;
    }
}

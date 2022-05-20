package cn.sdfirefly.javase.exer02_singleton;

/**
 * 懒汉式--》线程安全（适用于多线程）
 * @author sdfirefly
 * @create 2022/5/17--13:38
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    private Singleton5(){

    }

    public static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

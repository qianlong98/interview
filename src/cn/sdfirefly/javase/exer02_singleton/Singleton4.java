package cn.sdfirefly.javase.exer02_singleton;

/**
 * 懒汉式--》延迟创建对象线程不安全（适用于单线程）
 * @author sdfirefly
 * @create 2022/5/17--13:29
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4(){

    }

    public static Singleton4 getInstance(){
        if (instance == null){
            try {
                System.out.println("**************");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton4();
        }
        return instance;
    }
}

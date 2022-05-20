package cn.sdfirefly.javase.exer02_singleton;

/**
 * 懒汉式--》静态内部类形式（适用于多线程）
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，他是要单独去加载和初始化的
 * @author sdfirefly
 * @create 2022/5/17--14:23
 */
public class Singleton6 {

    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }


    private Singleton6(){

    }

    public static Singleton6 getInstance(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*******");
        return Inner.INSTANCE;
    }
}

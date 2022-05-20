package cn.sdfirefly.javase.exer02_singleton;

/**
 * 饿汉式--》直接实例化饿汉式（简洁直观）
 * @author sdfirefly
 * @create 2022/5/16--16:39
 */
public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){

    }
}

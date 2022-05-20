package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton2;

/**
 * @author sdfirefly
 * @create 2022/5/16--17:35
 */
public class TestSingleton2 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.INSTANCE;
        System.out.println(instance);
    }
}

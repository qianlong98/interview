package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton1;

/**
 * @author sdfirefly
 * @create 2022/5/16--17:34
 */
public class TestSingleton1 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println(instance);
    }
}

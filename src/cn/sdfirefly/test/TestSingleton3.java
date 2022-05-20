package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton3;

/**
 * @author sdfirefly
 * @create 2022/5/16--17:58
 */
public class TestSingleton3 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.INSTANCE;
        System.out.println(instance);
        instance.setInfo("静态代码块懒汉式");
        System.out.println(instance);
    }
}

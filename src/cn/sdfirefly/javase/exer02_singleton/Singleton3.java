package cn.sdfirefly.javase.exer02_singleton;

import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式--》静态代码块饿汉式（适合复杂实例化）
 * @author sdfirefly
 * @create 2022/5/16--17:27
 */
public class Singleton3 {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static final Singleton3 INSTANCE;

    static {
        Properties properties = new Properties();
        try {
            properties.load(Singleton3.class.getClassLoader().getResourceAsStream("singleton.properties"));
        } catch (IOException e) {
            throw new RuntimeException();
        }
        INSTANCE = new Singleton3(properties.getProperty("info"));
    }

    private Singleton3(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}

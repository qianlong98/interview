package cn.sdfirefly.javase.exer01_autoIncrement;

/**
 * @author sdfirefly
 * @create 2022/5/16--9:55
 */
public class AutoIncrement {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i); //4
        System.out.println("j=" + j); //1
        System.out.println("k=" + k); //11
    }
}

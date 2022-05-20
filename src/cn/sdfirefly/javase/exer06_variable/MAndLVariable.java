package cn.sdfirefly.javase.exer06_variable;

/**
 * 成员变量与局部变量
 * (见 src/不同变量的内存图.png)
 * @author sdfirefly
 * @create 2022/5/17--17:28
 */
public class MAndLVariable {
    static int s;//成员变量，类变量
    int i;//成员变量，实例变量
    int j;//成员变量，实例变量
    {
        int i = 1;//非静态代码块中的局部变量 i
        i++;
        j++;
        s++;
    }
    public void test(int j){//形参，局部变量,j
        j++;
        i++;
        s++;
    }
    public static void main(String[] args) {//形参，局部变量，args
        MAndLVariable obj1 = new MAndLVariable();//局部变量，obj1
        MAndLVariable obj2 = new MAndLVariable();//局部变量，obj1
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);
    }
}

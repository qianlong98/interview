package cn.sdfirefly.javase.exer05_recursion;

/**
 * 计算一步两步上楼梯走法问题--用循环
 * @author sdfirefly
 * @create 2022/5/17--16:45
 */
public class StepCountWithLoop {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(countStep(43));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static int countStep(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int two = 1;//最后走两步
        int one = 2;//最后走一步
        int sum = 0;//总步数

        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}

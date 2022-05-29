package cn.sdfirefly.javase.exer07_array;

/**
 * 5.矩形覆盖
 *      我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用n 个2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？
 * 比 如 n=3 时 ， 2*3 的 矩 形 块 有 3 种 覆盖方法。
 *
 *      还是找规律的一道题，归根结底还是 斐波那契数列
 *
 * @author sdfirefly
 * @create 2022/5/28--17:08
 */
public class TestArray05 {
    public static void main(String[] args) {
        int sum = rectCover(10);
        System.out.println(sum);
    }

    private static int rectCover(int target) {
        if (target <= 0){

            return 0;
        }
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        return rectCover(target - 1) + rectCover(target - 2);
    }
}

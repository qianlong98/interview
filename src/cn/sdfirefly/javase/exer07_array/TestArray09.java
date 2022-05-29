package cn.sdfirefly.javase.exer07_array;

import java.util.ArrayList;

/**
 * 9.丑数
 *      丑数的定义：把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。
 *      例如 6、8 都是丑数，但 14 不是，因为它包含质因子 7。 习惯上我们把1 当做是第一个丑数。
 *      求按从小到大的顺序的第 N 个丑数。
 *
 *  分析：
 * 首先从丑数的定义我们知道，一个丑数的因子只有 2,3,5，那么丑数p = 2 ^ x * 3 ^y * 5^z，
 * 换句话说一个丑数一定由另一个丑数乘以 2 或者乘以 3 或者乘以5 得到，那么我们从1开始
 * 乘以 2,3,5，就得到 2,3,5 三个丑数，在从这三个丑数出发乘以 2,3,5 就得到4，6,10,6，9,15,10,15,25 九个丑数，
 * 我们发现这种方法得到重复的丑数，而且我们题目要求第N个丑数。
 * （1）丑数数组： 1
 * 乘以 2 的队列：2
 * 乘以 3 的队列：3
 * 乘以 5 的队列：5
 * 选择三个队列头最小的数 2 加入丑数数组，同时将该最小的数乘以 2,3,5 放入三个队列；
 * （2）丑数数组：1,2
 * 乘以 2 的队列：4
 * 乘以 3 的队列：3，6
 * 乘以 5 的队列：5，10
 * 此时可能出现，乘以 5 的数值大于 乘以 3 的数值，所以要取 乘以3 和乘以5 的最小值
 * 选择三个队列头最小的数 3 加入丑数数组，同时将该最小的数乘以 2,3,5 放入三个队列；
 * （3）丑数数组：1,2,3
 * 乘以 2 的队列：4,6
 * 乘以 3 的队列：6,9
 * 乘以 5 的队列：5,10,15
 * 选择三个队列头里最小的数 4 加入丑数数组，同时将该最小的数乘以2,3,5 放入三个队列
 *
 * @author sdfirefly
 * @create 2022/5/29--14:17
 */
public class TestArray09 {
    public static void main(String[] args) {
        int uglyNum = getUglyNumber(7);
        System.out.println(uglyNum);
    }

    private static int getUglyNumber(int index) {
        if (index <= 0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0,i3 = 0,i5 = 0;
        while (list.size() < index){
            int i2_Value = list.get(i2) * 2;
            int i3_Value = list.get(i3) * 3;
            int i5_Value = list.get(i5) * 5;
            int minValue = Math.min(i2_Value,Math.min(i3_Value,i5_Value));
            list.add(minValue);
            if (minValue == i2_Value){
                i2++;
            }
            if (minValue == i3_Value){
                i3++;
            }
            if (minValue == i5_Value){
                i5++;
            }
        }
        return list.get(list.size() - 1);
    }
}

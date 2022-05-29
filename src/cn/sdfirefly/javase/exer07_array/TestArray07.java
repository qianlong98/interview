package cn.sdfirefly.javase.exer07_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 7.数组中出现次数超过一半的数字
 *      数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *      例如输入一个长度为 9 的数组{1,2,3,2,2,2,5,4,2}。由于数字 2 在数组中出现了5 次，超过
 *      数组长度的一半，因此输出 2。如果不存在则输出 0。
 *  #使用哈希表 思路: 使用 hash，key 是数字，value 是出现的次数
 * @author sdfirefly
 * @create 2022/5/29--9:42
 */
public class TestArray07 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,2,2,2,5,4,2 };
        int num = moreThanHalfNum(arr);
        if (num == 0){
            System.out.println("出现次数超过一半的数字不存在！");
        }else {
            System.out.println("数字为："+num);
        }
    }

    private static int moreThanHalfNum(int[] arr) {
        int len = arr.length;
        if (len == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:
             map.entrySet()) {
            if (entry.getValue() > len/2){
                return entry.getKey();
            }
        }

        return 0;
    }
}

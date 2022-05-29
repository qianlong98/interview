package cn.sdfirefly.javase.exer07_array;

import java.util.HashSet;

/**
 * 1.找数组当中重复的元素
 *      方法一：两层for循环 O(n^2)
 *      方法二：用哈希表存储 O(n)+O(N)《时间+空间》
 * @author sdfirefly
 * @create 2022/5/27--17:04
 */
public class TestArray01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,5,6,6,7,2,9,2};
        findDupicateInArray(arr);
        System.out.println("***************************");

        dupicate(arr);
    }

    private static void dupicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i :
                arr) {
            if (set.contains(i)){
                System.out.println("产生重复的就是："+i);
            }else {
                set.add(i);
            }
        }
    }

    private static void findDupicateInArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("arr["+j+"]=" + arr[j] + "与arr["+i+"]="+arr[i] + "重复");
                }
            }
        }
    }
}

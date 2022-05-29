package cn.sdfirefly.javase.exer07_array;

import java.util.Arrays;

/**
 * 6.调整数组顺序使奇数位于偶数前面
 *
 *      题目描述
 *  输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数
 *  位于数组的前半部分，所有的偶数位于数组的后半部分，
 *  并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author sdfirefly
 * @create 2022/5/28--17:42
 */
public class TestArray06 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,11,13,23,44,66,88};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reOrderArray(int[] arr) {
        int index = 0;//用于保存奇数的位置
        int temp;
        int j;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                j = i;
                while (j > index){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
                index++;
            }
        }
    }
}

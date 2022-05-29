package cn.sdfirefly.javase.exer07_array;

import java.util.Arrays;

/**
 * 2.反转一个数组
 *      方法一：定义一个新数组，把老数组中的元素反向添加到新数组中
 *      方法二：在本数组上进行反转
 * @author sdfirefly
 * @create 2022/5/27--17:08
 */
public class TestArray02 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        //定义一个新数组
        int[] newArr = newArrReverse(arr);
        System.out.println(Arrays.toString(newArr));

        //在本数组上进行反转
        ArrReverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void ArrReverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static int[] newArrReverse(int[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }
}

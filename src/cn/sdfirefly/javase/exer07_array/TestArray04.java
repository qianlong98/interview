package cn.sdfirefly.javase.exer07_array;

/**
 * 4.旋转数组的最小数字
 *      把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *      输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 *      例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *      NOTE：给出的所有元素都大于 0，若数组大小为 0，请返回 0。
 *      二分查找的变形，注意到旋转数组的首元素肯定不小于旋转数组的尾元素，设置中间点。
 * 1. 如果中间点大于首元素，说明最小数字在后面一半，如果中间点小于尾元素，说明最小数字
 * 在前一半。依次循环。
 * 2. 当一次循环中首元素小于尾元素，说明最小值就是首元素。
 * 3. 但是当首元素等于尾元素等于中间值，只能在这个区域顺序查找。
 * 如：【1,2,2,2,2,2,2,2,3,4】-->【2,3,4,1,2,2,2,2,2】
 * @author sdfirefly
 * @create 2022/5/28--16:11
 */
public class TestArray04 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,1,2,2,2,2,2};
        int min = minNumberInRotateArray(arr);
        System.out.println(min);
    }

    private static int minNumberInRotateArray(int[] array) {

        int len = array.length;
        if (len == 0){

            return 0;
        }

        //如果第一个数字都比最后一个数字小，则代表没有旋转
        int left = 0;
        int right = len - 1;
        if (array[left] < array[right]){
            return array[left];
        }

        int mid;
        int minVal = array[left];
        while ((right - left) > 1){
            mid = (right + left)/2;
            if (array[left] < array[mid]){
                left = mid;
            }else if (array[right] > array[mid]){
                right = mid;
            }else if (array[left] == array[mid] &&array[right] == array[mid]){
                //遍历找到最小值
                for (int i = 0; i < len; i++) {
                    if (minVal > array[i]){
                        minVal = array[i];
                        right = i;
                    }
                }
            }
        }
        return array[right];
    }



}









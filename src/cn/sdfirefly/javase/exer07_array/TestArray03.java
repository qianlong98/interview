package cn.sdfirefly.javase.exer07_array;

/**
 * 3.二维数组中的查找
 *      在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 *      每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * 现有矩阵 matrix 如下：
 * [
 * [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 * 从左下角开始搜索，如果该数大于目标数，则 行数 减去 1，向上搜索小的数值；如果小于目标数，则 列数 + 1 ，向左边搜索，搜索更大的数值
 * @author sdfirefly
 * @create 2022/5/28--11:02
 */
public class TestArray03 {
    public static void main(String[] args) {
        int array[][] = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean isExit = find(20,array);
        System.out.println(isExit);
    }

    private static boolean find(int target, int[][] array) {
        int row = array.length - 1;
        int col = 0;
        while (row >= 0 && col <= array[0].length - 1){
            if (array[row][col] == target){
                return true;
            }else if (array[row][col] > target){
                row--;
            }else {
                col++;
            }
        }
        return false;
    }
}

package cn.sdfirefly.javase.exer07_array;

/**
 * 8.把数组排成最小数
 *      输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 *      打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 这里自定义一个比较大小的函数，比较两个字符串 s1, s2 大小的时候，先将它们拼接起来，
 * 比较 s1+s2,和 s2+s1 那个大，如果 s1+s2 大，那说明 s2 应该放前面，所以按这个规则，
 * s2 就应该排在 s1 前面。（类似于排序算法）
 * 比如： s1 = 32， s2 = 321， 先将两者字符串转换成数字，比较 s1 + s2 = 32321，
 * 和s2 + s1 = 32132 的数字的大小，
 * 如果前者比较大的话，将 s1 和 s2 交换。
 * 代码这里使用了一个小技巧：
 * int pre = Integer.valueOf(numbers[i] +"" + numbers[j]); // 将数字转换为字符串，拼接，再转换成数字
 * @author sdfirefly
 * @create 2022/5/29--13:49
 */
public class TestArray08 {
    public static void main(String[] args) {
        int arr[] = new int[]{3,32,321};
        String minNum = printMinNumber(arr);
        System.out.println(minNum);
    }

    private static String printMinNumber(int[] numbers) {
        String res = "";
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int pre = Integer.parseInt(numbers[i]+""+numbers[j]);
                int tail = Integer.parseInt(numbers[j]+""+numbers[i]);
                if (pre > tail){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            res+=numbers[i];
        }
        return res;
    }
}

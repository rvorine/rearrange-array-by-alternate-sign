import java.util.Arrays;

public class RearrangeBySign {

    static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0, neg = 1; // positives fill even slots, negatives fill odd slots

        for (int num : nums) {
            if (num > 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{3, 1, -2, -5, 2, -4}))); // [3, -2, 1, -5, 2, -4]
        System.out.println(Arrays.toString(rearrangeArray(new int[]{-1, 1})));               // [1, -1]
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, 2, -1, -2})));        // [1, -1, 2, -2]
    }
}

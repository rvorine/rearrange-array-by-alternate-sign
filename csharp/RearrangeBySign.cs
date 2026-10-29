using System;

class RearrangeBySign
{
    static int[] RearrangeArray(int[] nums)
    {
        int[] result = new int[nums.Length];
        int pos = 0, neg = 1; // positives fill even slots, negatives fill odd slots

        foreach (int num in nums)
        {
            if (num > 0)
            {
                result[pos] = num;
                pos += 2;
            }
            else
            {
                result[neg] = num;
                neg += 2;
            }
        }
        return result;
    }

    static void Main()
    {
        Console.WriteLine(string.Join(", ", RearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 }))); // 3, -2, 1, -5, 2, -4
        Console.WriteLine(string.Join(", ", RearrangeArray(new int[] { -1, 1 })));               // 1, -1
        Console.WriteLine(string.Join(", ", RearrangeArray(new int[] { 1, 2, -1, -2 })));        // 1, -1, 2, -2
    }
}

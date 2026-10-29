def rearrange_array(nums):
    result = [0] * len(nums)
    pos, neg = 0, 1  # positives fill even slots, negatives fill odd slots

    for num in nums:
        if num > 0:
            result[pos] = num
            pos += 2
        else:
            result[neg] = num
            neg += 2

    return result


if __name__ == "__main__":
    print(rearrange_array([3, 1, -2, -5, 2, -4]))  # [3, -2, 1, -5, 2, -4]
    print(rearrange_array([-1, 1]))                # [1, -1]
    print(rearrange_array([1, 2, -1, -2]))         # [1, -1, 2, -2]

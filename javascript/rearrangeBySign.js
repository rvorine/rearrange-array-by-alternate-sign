function rearrangeArray(nums) {
  const result = new Array(nums.length);
  let pos = 0, neg = 1; // positives fill even slots, negatives fill odd slots

  for (const num of nums) {
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

console.log(rearrangeArray([3, 1, -2, -5, 2, -4])); // [3, -2, 1, -5, 2, -4]
console.log(rearrangeArray([-1, 1]));               // [1, -1]
console.log(rearrangeArray([1, 2, -1, -2]));        // [1, -1, 2, -2]

module.exports = { rearrangeArray };

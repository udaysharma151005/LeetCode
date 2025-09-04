class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> Sum = new HashMap<>();
        Sum.put(0,1);
        int currentSum = 0;
        int count = 0;
        for (int num : nums) {
             currentSum += num;
            int complement = currentSum - k;
            if (Sum.containsKey(complement)) {
                count += Sum.get(complement);
            }
            Sum.put(currentSum, Sum.getOrDefault(currentSum, 0) + 1);
        }
            return count;   
    }
}
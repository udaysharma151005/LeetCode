class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length, majorityCount = n/2;
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            if(hm.get(num) > majorityCount)
                return num;
        }
        return -1;
    }
}

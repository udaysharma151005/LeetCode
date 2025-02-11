class Solution {
    public char findTheDifference(String s, String t) {
        char [] a = s.toCharArray();
        Arrays.sort(a);
        char [] b = t.toCharArray();
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++){
            if(b[i] != a[i]){
                return b[i];
            }
        }
        return b[b.length - 1];
    }
}
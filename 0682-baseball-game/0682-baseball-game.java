class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                int a = Integer.parseInt(operations[i]);
                stack.push(a);
            }
        }
        int result = 0;
        for( int i : stack)
        result += i;
        return result;
    }
}
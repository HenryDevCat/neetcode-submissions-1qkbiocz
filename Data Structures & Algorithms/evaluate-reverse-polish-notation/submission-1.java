class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        int num1;
        int num2;
        int num3;
        int sum;
        for (String token : tokens) {
            if (token.equals("+")) {
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2 + num1;
                stack.push(num2 + num1);
                System.out.println("num1 " + num1 + " num2 " + num2 + "num3 " + num3);
            } else if (token.equals("-")) {
                num1 = stack.pop();
                num2 = stack.pop();
                num3 = num2 + num1;
                stack.push(num2 - num1);
                System.out.println("num1 " + num1 + " num2 " + num2 + "num3 " + num3);
            } else if (token.equals("*")) {
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 * num1);
            } else if (token.equals("/")) {
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 / num1);
            } else {
                stack.push(Integer.parseInt(token));
                System.out.println("token pushed = " + token);
            }
        }
        return stack.peek();
    }
}

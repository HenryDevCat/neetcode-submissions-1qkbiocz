class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>stack = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int[] pair = new int[]{ temperatures[i], i };
            while (!stack.isEmpty() && pair[0] > stack.peek()[0]) {
                int[] target = stack.pop();
                res[target[1]] = pair[1] - target[1];
            } 
            stack.push(pair);
        }

        return res;
    }
}

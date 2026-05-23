class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> temp = new Stack<>();
        for(int j=0;j<tokens.length;j++){
                if(tokens[j].equals("*")){
                    int a = temp.pop();
                    int b = temp.pop();
                    temp.add(a*b);
                }
                else if(tokens[j].equals("/")) {
                    int a = temp.pop();
                    int b = temp.pop();
                    temp.add(b/a);
                }
                else if(tokens[j].equals("+")){
                    int a = temp.pop();
                    int b = temp.pop();
                    temp.add(a+b);
                } 
                else if(tokens[j].equals("-")) {
                    int a = temp.pop();
                    int b = temp.pop();
                    temp.add(b-a);
                }
            else temp.add(Integer.parseInt(tokens[j]));
           
        }
            return temp.get(0);
    }
}

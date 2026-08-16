class Solution {
    public boolean isValid(String t) {

        Stack<Character> s = new Stack<>();

        for(int i=0;i<t.length();i++){

            char c=t.charAt(i);

            if(c=='(' || c=='{' || c=='[')
            s.push(c);
            else if(c==')' && !s.empty()&& s.peek()=='(')
                s.pop();
            else if(c=='}' && !s.empty()&& s.peek()=='{')
                s.pop();
            else if(c==']' && !s.empty()&& s.peek()=='[')
                s.pop();
            else
                return false;
        }

        return s.empty();
        
    }
}

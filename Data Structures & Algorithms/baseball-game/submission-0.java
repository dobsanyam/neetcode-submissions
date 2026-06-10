class Solution {
    public int calPoints(String[] o) {

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<o.length;i++){
            if(o[i].equals("+")){
                int a,b;
                b=s.pop();
                a=s.pop();
                s.push(a);
                s.push(b);
                s.push(a+b);
            }
            else if(o[i].equals("D")){
                int a,b;
                b=s.pop();
            
                s.push(b);
                s.push(2*b);
            }
            else if(o[i].equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(o[i]));
            }
            
        }
        int a=0;

        while(!s.empty())
        {
            a=a+s.pop();
        }
        return a;
    }
}
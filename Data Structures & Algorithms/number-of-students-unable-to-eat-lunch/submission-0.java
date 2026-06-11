class Solution {
    public int countStudents(int[] s, int[] san) {
        
        int c0=0;
        int c1=0;

        for(int i=0;i<s.length;i++){
            if(s[i]==0)
                c0++;
             else
                c1++;
        }

        for(int i=0;i<san.length;i++){
            if(san[i]==0 && c0>0)
                c0--;
            else if(san[i]==1 && c1>0)
                c1--;
            else
                break;
        }

        return c0+c1;
}
}
class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        
        int m=0,c=0;
        for(int i=0;i<n.length;i++) {

            if(m<c)
                m=c;
            if(n[i]==1)
                c++;
            else
                c=0;
        }
        if(m<c)
                m=c;
        return m;
    }
}
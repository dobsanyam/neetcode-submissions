class Solution {
    public int[] replaceElements(int[] a) {

        int t=a.length-1;
        
        int m=a[t];
        a[t]=-1;
        
        for(int i=t-1;i>=0;i--){
            int l=a[i];
            a[i]=Math.max(m,a[i+1]);
            m=l;
        }
        return a;
    }
}
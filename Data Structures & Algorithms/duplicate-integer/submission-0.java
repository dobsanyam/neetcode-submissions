class Solution {
    public boolean hasDuplicate(int[] n) {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < n.length; i++) {
            if (s.contains(n[i]))
                return true;
            else
                s.add(n[i]);
        }
        return false;
    }
}
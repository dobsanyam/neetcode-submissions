class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char[] x= strs[i].toCharArray();
            Arrays.sort(x);
            String t = String.valueOf(x);
           // System.out.println(t);
            if (map.containsKey(t)) {
                List<String> s = map.get(t);
                s.add(strs[i]);
                map.put(t,s);
            } else {
                List<String> s = new ArrayList();
                s.add(strs[i]);
                map.put(t,s);
            }
        }
    List<List<String>> a = new ArrayList<>();
        for(String m : map.keySet()){
            a.add(map.get(m));
        }
        return a;
    }
}

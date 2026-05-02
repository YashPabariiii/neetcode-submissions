class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> sCount = new HashMap<>(s.length());
        Map<Character,Integer> tCount = new HashMap<>(t.length());
        for(int i = 0;i< s.length();i++){
             sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i< t.length();i++){
             tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
        }
        return sCount.equals(tCount);
    }
}

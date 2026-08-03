class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            int counts=0;
            int countt=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    counts++;
                }
                 if(s.charAt(i) == t.charAt(j)){
                    countt++;
                }
            }
            if(counts!=countt){
                return false;
            }
        }
        return true;

    }
}

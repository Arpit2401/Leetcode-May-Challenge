/**
*Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
*Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
*The order of output does not matter.
**/



//Solution 1 Passes all cases

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return rst;
        }

        int[] map_p = new int[26];
        for (int i = 0; i < p.length(); i++) {
            map_p[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <=s.length() - p.length(); i++) {
            int[] map_s = new int[26];
            for (int j = 0; j < p.length(); j++) {
                map_s[s.charAt(i+j) - 'a']++;
            }
            if (isMatch(map_p, map_s)) {
                rst.add(i);
            }
        }
        return rst;
    }

    public boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}


//Solution 2 Passes 35/36 Cases

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         char[] ch = p.toCharArray(); 
         Arrays.sort(ch);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=s.length()-ch.length;i++)
        {
            char ch1[]=s.substring(i,i+ch.length).toCharArray();
            Arrays.sort(ch1);
            String str = new String(ch);
            String str1 = new String(ch1);
            if(str.equals(str1))
                list.add(i);
        }
        return list;
        
        
    }
}

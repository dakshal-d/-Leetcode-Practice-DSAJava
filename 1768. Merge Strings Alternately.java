// 1768. Merge Strings Alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder a= new StringBuilder();
        int i=0;
        while(i<word1.length()|| i<word2.length()){
            if(i<word1.length()){
                a.append(word1.charAt(i));
            }
            if(i<word2.length()){
                a.append(word2.charAt(i));
            }
            i++;
        }
        return a.toString();
        
    }
}
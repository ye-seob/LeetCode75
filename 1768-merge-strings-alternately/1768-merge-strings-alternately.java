class Solution {
    public String mergeAlternately(String str1, String str2) {
        
       int minLen = Math.min(str1.length(), str2.length());

         StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < minLen; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        
        sb.append(str1.substring(minLen)); //len부터 끝까지(substring메소드 인자가 하나라면,두 개면 첫인자부터 두번째 인자까지)
        sb.append(str2.substring(minLen));
        
        return sb.toString();
    }
}
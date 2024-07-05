package week1;

public class week1_1 {
    public static void main(String[] args) {
    //     class Solution {
	//     public String mergeAlternately(String str1, String str2) {
	//         char[] str3 = new char[str1.length() + str2.length()];
	
	//         int j = 0;
	//         int i = 0;
	// 				//길이가 같을 때
	//         if (str1.length() == str2.length()) {
	//             for (i = 0; i < str1.length(); i++) {
	//                 str3[j] = str1.charAt(i);
	//                 j++;
	//                 str3[j] = str2.charAt(i);
	//                 j++;
	//             }
	//         } 
	//         //str2가 더 길 때
	//         else if (str1.length() < str2.length()) {
	//             for (i = 0; i < str1.length(); i++) {
	//                 str3[j] = str1.charAt(i);
	//                 j++;
	//                 str3[j] = str2.charAt(i);
	//                 j++;
	//             }
	//             for (int k = i; k < str2.length(); k++) {
	//                 str3[j] = str2.charAt(k);
	//                 j++;
	//             }
	//         } 
	//         //str1가 더 길 때
	//         else {
	//             for (i = 0; i < str2.length(); i++) {
	//                 str3[j] = str1.charAt(i);
	//                 j++;
	//                 str3[j] = str2.charAt(i);
	//                 j++;
	//             }
	//             for (int k = i; k < str1.length(); k++) {
	//                 str3[j] = str1.charAt(k);
	//                 j++;
	//             }
	//         }
	
	//         return new String(str3);
	//     }
	// }
	
	
	
	
	// class Solution {
	//     public String mergeAlternately(String str1, String str2) {
	        
	//        int minLen = Math.min(str1.length(), str2.length());
	
	//          StringBuilder sb = new StringBuilder();
	        
	//         for (int i = 0; i < minLen; i++) {
	//             sb.append(str1.charAt(i));
	//             sb.append(str2.charAt(i));
	//         }
	        
	//         sb.append(str1.substring(minLen)); //(substring메소드 인자가 하나라면 len부터 끝까지,두 개면 첫인자부터 두번째 인자까지)
	//         sb.append(str2.substring(minLen));
	        
	//         return sb.toString();
	//     }
	// }
    }
}

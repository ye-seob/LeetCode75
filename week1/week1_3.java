package week1;


public class week1_3 {
    public static void main(String[] args) {
//         //시간 초과
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int n = nums.length;

//         int num = n - (k - 1); //길이가 k인 부분합의 개수 
//         int[] sum = new int[num]; //부분합을 담을 배열
        
//         for (int i = 0; i < num; i++) {
//             for (int j = 0; j < k; j++) {
//                 sum[i] += nums[i+j];
//             }
//         }

//          Arrays.sort(sum); //오름차순 정렬
//         double max = sum[sum.length - 1];

//         return (double) max / k;
//     }
// }
// //슬라이딩 윈도우 알고리즘 적용
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int n = nums.length;
     

//         int window = 0;

//         for(int i = 0; i < k; i++){ //길이가 k인 윈도우 초기화
//             window += nums[i];
//         }
     
//         double maxAvg = (double) window / k;

//          for (int i = k; i < n; i++) {
//             window = window - nums[i - k] + nums[i]; //윈도우 이동
            
//             double currentAvg = (double) window / k;
//             if (currentAvg > maxAvg) {
//                 maxAvg = currentAvg; 
//             }
//         }
      

//         return maxAvg;
//     }
// }

    }
}

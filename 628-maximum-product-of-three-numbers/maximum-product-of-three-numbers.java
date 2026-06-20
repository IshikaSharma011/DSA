import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int product1= nums[n-1] * nums[n-2] * nums[n-3];
        int product2= nums[0] * nums[1] * nums[n-1];

        return Math.max(product1,product2);
    }
}

// class Solution {
//     public int maximumProduct(int[] nums) {
//     int maxProduct=Integer.MIN_VALUE;
//     for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//             for(int k=j+1;k<nums.length;k++){
//                 int product=nums[i] * nums[j] * nums[k];
//                 if (product>maxProduct){
//                     maxProduct=product;
//                 }
//             }
//         }
//     }
//     return maxProduct;
//     }
// } time complexity increasezs with n number which make it more slow for n num of operations
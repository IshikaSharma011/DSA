// class Solution {
//     public int[] sortArrayByParity(int[] nums) {

//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-i-1;j++){
//                 //solved using bubble sort for optimal code use two pointer
//                 // Swap if odd comes before even
//                 if(nums[j] %2==1 && nums[j+1] % 2 ==0){
//                     int temp= nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
//         return nums;
//     }
// }


class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0)
                left++;

            if (nums[right] % 2 == 1)
                right--;
        }

        return nums;
    }
}
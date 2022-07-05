// using kadane's algorithm

public class subarraySum {
    public static void main(String[] args) {
        int nums[] ={-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubarray(nums);  //calling the function maxSubarray and initialising it to a variable
        System.out.println(result);

    }
    public static int maxSubarray(int[] nums){
        int sum =0;
        int maxi = nums[0];
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(sum<0) sum=0;
            if(sum>maxi) maxi=sum;
        }
        return maxi;


    }

}

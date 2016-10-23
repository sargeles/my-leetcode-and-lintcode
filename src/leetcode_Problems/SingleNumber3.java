package leetcode_Problems;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
    	int diff = 0;
    	int[] result ={0,0};
    	// 得到和
    	for(int num:nums)
        diff ^= num;
        // 得到二进制数的最右边的一个1的位置
        diff &= -diff;
    	for(int num:nums){
    		if((num & diff) == 0)
    		{
    			result[0] ^= num;
    		}
    		else
    		{
    			result[1] ^= num;
    		}
    	}
        return result;
    }
}
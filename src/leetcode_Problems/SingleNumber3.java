package leetcode_Problems;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
    	int diff = 0;
    	int[] result ={0,0};
    	// �õ���
    	for(int num:nums)
        diff ^= num;
        // �õ��������������ұߵ�һ��1��λ��
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
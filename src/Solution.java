/**
 * 建立一個計數器兼指標count，用迴圈走訪nums，比對指標count與走訪的資料是否不同，若不同則更新計數器，相同則不動作
 * 並同時更新指標內容，以利下次比對。
 * @author black
 *
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.equals(null) || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        for(int i = 1; i < nums.length;i++)
        {	
        	if(nums[count]!=nums[i] && (count!=i))
        	{
        		count++;
        		nums[count]=nums[i];
        	}
        }
        return ++count;
    }
}

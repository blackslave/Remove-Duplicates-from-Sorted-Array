/**
 * 題目的意思，給一個排序好的陣列(array)，消除其中重複的數字，然後回傳新的陣列的長度。
 * 不允許建立新的陣列。必須透過回傳一個固定的數字，來表示陣列的長度。
 * @author black
 *
 */
public class removeDuplicates {
	public static void main(String []args){
		Solution Solution = new Solution();
		int [] num ={1,2,3};
		int a = Solution.removeDuplicates(num);
		System.out.println("Arraylength:"+a);
		for(int i = 0 ;i<num.length;i++)
		{
			System.out.println("Array:"+num[i]);
		}
	}
}

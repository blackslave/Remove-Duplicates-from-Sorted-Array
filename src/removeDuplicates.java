/**
 * ��ړI�ӎv�C����r���D�I�w��(array)�C���������d���I�Ɏ��C�R���B�V�I�w��I���x�B
 * �s�򋖌����V�I�w��B�K�{���߉�B��Œ�I�Ɏ��C�ҕ\���w��I���x�B
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

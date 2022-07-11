
public class Array_5
{

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 2, 3 };
		System.out.println(nums1.length);
		int[] nums2 = nums1; // 얕은 복사 - 그냥 복사
		System.out.println(nums2.length);

		int[] nums3 = new int[3];
		for (int i = 0; i < nums1.length; i++)
		{// 깊은 복사 - 새로운 배열을 만들고 내용을 복사
			nums3[i] = nums1[i];
		}
		nums2[0] = 9;
		System.out.println(nums1[0]);
		nums3[0] = 100;
		System.out.println(nums1[0]);
		nums3 = new int[3];
		System.out.println(nums3[0]);

		System.out.println(nums3.length);
		nums3 = new int[5];
		System.out.println(nums3.length);
	}
}

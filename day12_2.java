//使用函数求最大值
public class day12_2 {
	public int MAX(int[] a) {
		int i=0;
		int max=a[0];
		for(i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		day12_2 s=new day12_2();
		int a[]= {1,2,3,-3,4,4,4,10,5,100,5,5,5,5,5,6,6,6,7,4};
		int m;
		m=s.MAX(a);
		System.out.println(m);
	}
}

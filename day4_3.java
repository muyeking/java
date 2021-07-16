//求最大值
public class day4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,-3,4,4,4,10,5,100,5,5,5,5,5,6,6,6,7,4};
		int i=0;
		int max=a[0];
		for(i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

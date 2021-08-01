//ÓÃº¯ÊıÅÅĞò
public class day12_1 {
	public int[] PaiXu(int[] a) {
		int i;
		int j;
		int t=0;
		for(i=0;i<a.length-1;i++) {
			for(j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day12_1 s=new day12_1();
		int[] a=new int[]{1,2,3,-3,4,4,4,10,5,100,5,5,5,5,5,6,6,6,7,4};
		a=s.PaiXu(a);
		int i=1;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

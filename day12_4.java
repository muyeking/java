//≤Â»Î∫œ  Œª÷√
public class day12_4 {
	public int[] InsertToArray(int a) {
		int m[]= {a,1,3,6,8,54};
		int i=0;
		for(i=0;i<6;i++) {
			System.out.println(m[i]);
		}
		int t=0;
		for(int j=0;j<5;j++) {
			if(m[j]>m[j+1]) {
				t=m[j];
				m[j]=m[j+1];
				m[j+1]=t;
			}
		}
//		int i=0;
//		for(i=0;i<6;i++) {
//			System.out.println(m[i]);
//		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day12_4 s=new day12_4();
		int a[];
		a=s.InsertToArray(6);
		System.out.printf("{%d %d %d %d %d %d}",a[0],a[1],a[2],a[3],a[4],a[5]);
	}

}

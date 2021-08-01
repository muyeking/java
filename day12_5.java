//输入数字和数组，使用函数
public class day12_5 {
	public int[] InsertToArray(int a,int m[]) {
		int n[]=new int[m.length+1];
		int i=0;
		n[0]=a;
		for(i=0;i<n.length-1;i++) {
			n[i+1]=m[i];		}
		for(i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		int t=0;
		for(int j=0;j<m.length-1;j++) {
			if(n[j]>n[j+1]) {
				t=n[j];
				n[j]=n[j+1];
				n[j+1]=t;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day12_5 s=new day12_5();
		int a[];
		int m[]={1,2,3,4,6,7,8,9,54};
		a=s.InsertToArray(6,m);
		int i;
		for(i=0;i<a.length;i++) {
			System.out.printf("%d ",a[i]);
		}
	}

}

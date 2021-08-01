//使用函数数组排序，返回值是数组
//函数参数为数组,一个class里有多个函数
public class day11_2 {
	public int[] PaiXu(int x,int y,int z) {
		int t;
		if(x>y) {
			t=y;
			y=x;
			x=t;
//			System.out.printf("%d,%d\n",x,y);
		}
		if(x>z) {
			t=z;
			z=x;
			x=t;
		}
		//System.out.printf("%d\n",x);
		if(y>z) {
			t=z;
			z=y;
			y=t;
		}
		int mat[]= {x,y,z};
		return mat;
		
	}
	public int[] ShuZu(int[] n) {
		int t;
		if(n[0]>n[1]) {
			t=n[1];
			n[1]=n[0];
			n[0]=t;
//			System.out.printf("%d,%d\n",n[0],y);
		}
		if(n[0]>n[2]) {
			t=n[2];
			n[2]=n[0];
			n[0]=t;
		}
		//System.out.printf("%d\n",n[0]);
		if(n[1]>n[2]) {
			t=n[2];
			n[2]=n[1];
			n[1]=t;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day11_2 s=new day11_2();
		int[] m;
		m=s.PaiXu(8, 4, 5);
		int i=1;
		for(i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
//		System.out.println(m[1]);
//		System.out.println(m[2]);
		int[] n=new int[]{8,4,5};
		n=s.ShuZu(n);
		for(i=0;i<n.length;i++) {
			System.out.print(n[i]);
		}
	}

}

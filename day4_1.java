
public class day4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=9;
			int y=7;
			int z=4;
			int t;
			if(x>y) {
				t=y;
				y=x;
				x=t;
//				System.out.printf("%d,%d\n",x,y);
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
			System.out.printf("%d %d %d\n",x,y,z);
	}

}

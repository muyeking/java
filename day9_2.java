//函数的返回值为数组
public class day9_2 {
	public int[] staticAll(String s) {
		int i=0;
		int j=0;
		int k=0;
		int n=0;
		int m=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>'0'&&c<'9') {
				j++;	
			}
			else if(c>='a'&&c<='z') {
				k++;
			}
			else if(c>='A'&&c<='Z') {
				k++;
			}
			else if(c==' ') {
				n++;
			}
			else {
				m++;
			}
		}
		int mat[]= {j,k,n,m};
		return mat;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="AaZz @ 123 ";
		day9_2 s=new day9_2();
		int[] staticall;
		staticall=s.staticAll(x);
		System.out.println(staticall[0]);
		System.out.println(staticall[1]);
		System.out.println(staticall[2]);
		System.out.println(staticall[3]);
	}

}

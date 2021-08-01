//不固定回文数位数
public class day13_2 {
	public int MCiFang(int m) {            //10的m次方
		int n=1;
		for(int i=1;i<=m;i++) {
			n=n*10;
			
		}
		return n;
	}
	public int getLength(int m) {
		int n;
		int t=m;
		for( n=0;n<100;n++) {
			if(m/10!=0) {
				m=m/10;
//				System.out.println(m);
//				System.out.println(n);
			}
			else {
				break;
			}
		}
		return n+1;
	}
	public int isHuiWenShu(int m) {
		int mlength=getLength(m);
//		for( n=0;n<100;n++) {
//			if(m/10!=0) {
//				m=m/10;
//				System.out.println(m);
//				System.out.println(n);
//			}
//			else {
//				break;
//			}
//		}
		String s="";
		s=String.valueOf(m);
		System.out.println(s);
		char mat[]=new char[mlength];
	    int i=0;
		for(i=0;i<mlength;i++) {
			mat[i]=s.charAt(i);
		}
//		for(i=0;i<mat.length;i++) {
//			System.out.println(mat[i]);
//		}
		for(int j=0;j<mlength/2;j++) {
			if(mat[j]!=mat[mlength-1-j]) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day13_2 s=new day13_2();
		int t=6;
		t=s.isHuiWenShu(123454321);
		if(t==1) {
			System.out.println("该数不是回文数");
		}
		else {
			System.out.println("该数是回文数");
		}
	}

}

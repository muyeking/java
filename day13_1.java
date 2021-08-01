//函数求回文数
public class day13_1 {
	public int HuiWenShu(int m) {
		int a,b,c,d,e;
		a=m/10000;
		b=(m-a*10000)/1000;
		c=(m-a*10000-b*1000)/100;
		d=(m-a*10000-b*1000-c*100)/10;
		e=m-a*10000-b*1000-c*100-d*10;
//		System.out.printf("%d %d %d %d %d",a,b,c,d,e);
		if(a==e&&b==d) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day13_1 s=new day13_1();
		int t;
		t=s.HuiWenShu(12541);
		if(t==1) {
			System.out.println("该数是回文数");
		}
		else {
			System.out.println("该数不是回文数");
		}
	}

}

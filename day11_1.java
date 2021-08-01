//不带参数的函数，求完全平方数
public class day11_1 {
	public int WanQuanPingFang() {
		int a=1;
		double b;
		double c;
		double d;
		double e;
		for(a=1;a>0;a++) {
			
			b=Math.sqrt(a+100);
			c=(int)(Math.sqrt(a+100));
			d=Math.sqrt(a+168);
			e=(int)(Math.sqrt(a+168));
			if(c==b&&d==e) {
				System.out.println("这个数是完全平方数");
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day11_1 s=new day11_1();
		int result;
		result=s.WanQuanPingFang();
		System.out.println(result);
	}

}

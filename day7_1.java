//ˮ�ɻ���
public class day7_1 {
	public void Shuixianhua() {
		int a,b,c;
		for(a=1;a<10;a++) {
			for(b=0;b<10;b++) {
				for(c=0;c<10;c++) {
					int d=a*100+b*10+c;
					if(d==a*a*a+b*b*b+c*c*c) {
						System.out.printf("%d\n",d);
						System.out.println("������ˮ�ɻ���");
					}
				}
			}
		}
	}
	public int isShuixianhua(int n) {
		int a,b,c;
		a=(int)(n/100);
		b=(int)((n-a*100)/10);
		c=n-a*100-b*10;
		if(n<100||n>999) {
			return 2;
		}
		if(n==a*a*a+b*b*b+c*c*c) {
//			System.out.printf("%d\n",n);
//			System.out.println("������ˮ�ɻ���");
			return 1;
		}
		else {
//			System.out.printf("%d ",n);
//			System.out.println("��������ˮ�ɻ���");
			return 0;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day7_1 m=new day7_1();
		m.Shuixianhua();
		day7_1 p=new day7_1();
		//p.isShuixianhua(153);
		int result=5;
		int x=1000;
		result=p.isShuixianhua(x);
		if(result==1) {
			System.out.printf("%d ",x);
			System.out.println("������ˮ�ɻ���");
		}
		else if(result==0) {
			System.out.printf("%d ",x);
			System.out.println("��������ˮ�ɻ���");
		}
		else {
			System.out.println("����������λ��");
		}
	}

}

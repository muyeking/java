
public class day3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					System.out.println("���������ȫƽ����");
					System.out.printf("�������%d",a);
					break;
				}
			}
	}
}



//定义函数判断素数
public class day6_1 {
	public int isSushu(int n) {
		int j=1;
		int flag=0;		
		for(j=1;j<n;j++) {
			if(j!=1&&j!=n&&n%j==0) {
				flag=1;
			}
		}	
		if(flag==1) {
			System.out.printf("%d ",n);
			//System.out.println("该数不是素数");
			return 0;
		}
		else {
			System.out.printf("%d ",n);
			System.out.println("该数是素数");
			return 1;
		}
		//System.out.printf("n=%d\n",n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day6_1 s=new day6_1();
		//s.isSushu(110);
		int result=s.isSushu(103);
		System.out.printf("result=%d",result);
	}

}

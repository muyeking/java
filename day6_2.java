//定义函数判断素数
public class day6_2 {
	public int isSushu(int n) {
		int j=1;
		int flag=0;
		for(j=1;j<n;j++) {
			if(j!=1&&j!=n&&n%j==0) {
				flag=1;
			}
		}	
		if(flag==1) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day6_2 s=new day6_2();
		int m=101;
		int result=5;
		for(m=101;m<201;m++) {
			result=s.isSushu(m);
			if(result==1) {
				System.out.printf("%d ",m);
				System.out.println("该数是素数");
			}
		}
		
		//System.out.printf("result=%d",result);
	}

}

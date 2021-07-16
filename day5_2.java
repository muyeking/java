//素数
public class day5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=110;
			int j=1;
			int flag=0;		
				for(j=1;j<n;j++) {
					if(j!=1&&j!=n&&n%j==0) {
						//System.out.printf("%d ",i);
						//System.out.println("该数不是素数");
						flag=1;
					}
				}	
			if(flag==1) {
				System.out.printf("%d ",n);
				System.out.println("该数不是素数");
			}
			else {
				System.out.printf("%d ",n);
				System.out.println("该数是素数");
			}
	}

}

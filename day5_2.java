//����
public class day5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=110;
			int j=1;
			int flag=0;		
				for(j=1;j<n;j++) {
					if(j!=1&&j!=n&&n%j==0) {
						//System.out.printf("%d ",i);
						//System.out.println("������������");
						flag=1;
					}
				}	
			if(flag==1) {
				System.out.printf("%d ",n);
				System.out.println("������������");
			}
			else {
				System.out.printf("%d ",n);
				System.out.println("����������");
			}
	}

}

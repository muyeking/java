
public class day9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
//		for(int i=1;i<10;i++) {
//			
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//		}
		//System.out.println(sum);
		for(int j=1;j<10;j++) {
			if(j%2==0) {
				continue;
			}
			sum=sum+j;
		}
		System.out.println(sum);
	}

}

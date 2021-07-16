//³Ë·¨¿Ú¾÷±í
public class day5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=1;
			int j=1;
		    int n=0;
			for(i=1;i<10;i++)
			{
				for(j=1;j<10;j++) {
					n=i*j;
//					if(i>j)
//					{
//						System.out.println("...");
//						break;
//					}
					if(i<=j) {
						System.out.printf("%d*%d=%d ",i,j,n);
					}
				}
				
				System.out.printf("\n");
			}
			
			
	}

}

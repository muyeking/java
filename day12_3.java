//用函数输出的乘法口诀表
public class day12_3 {
	public void CFkoujuebiao() {
		int i=1;
		int j=1;
	    int n=0;
		for(i=1;i<10;i++)
		{
			for(j=1;j<10;j++) {
				n=i*j;
//				if(i>j)
//				{
//					System.out.println("...");
//					break;
//				}
				if(i<=j) {
					System.out.printf("%d*%d=%d ",i,j,n);
				}
			}
			
			System.out.printf("\n");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day12_3 s=new day12_3();
		s.CFkoujuebiao();
	}

}

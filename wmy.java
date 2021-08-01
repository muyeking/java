
public class wmy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[]= {2,7,11,15};
		//System.out.println(mat[0]);
		int target=9;
		//if(mat[0]+mat[1]==9)
			//System.out.println("[0,1]");
		for(int i=0;i<mat.length;i++) {
			for(int j=i+1;j<mat.length;j++) {
				if(mat[i]+mat[j]==target) {
					System.out.printf("i=%d\n",i);
		            System.out.printf("j=%d\n",j);
		            System.out.printf("[i,j]=[%d,%d]\n",i,j);
	}
	}
		}
	}
}

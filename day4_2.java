//输出最大值
public class day4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {1,2,3,-3,4,4,4,10,5,100,5,5,5,5,5,6,6,6,7,4};
			int i;
			int j;
			int t=0;
			for(i=0;i<a.length-1;i++) {
				for(j=0;j<a.length-1-i;j++) {
					if(a[j]>a[j+1]) {
						t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
			}
			System.out.printf("%d\n",a[19]);
			for(int b=0;b<20;b++) {
				System.out.println(a[b]);
			}
	}

}

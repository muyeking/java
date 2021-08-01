//用数组计算天数
public class day3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        //int n=0;
			int mat[]={31,29,31,30,31,30,31,31,30,31,30,31};
			int year=2020;
			int month=3;
			int day=1;
			int sum=0;
			//n=month-1;
			for(int n=0;n<month-1;n++)
			{
				sum=sum+mat[n];
			}
			if(year%4==0&&month>2) {
				sum=sum+day-1;
				//System.out.printf("...");
			}
			else {
				sum=sum+day;
				//System.out.println(",,,");
			}
			System.out.printf("这一天是这一年的第%d天",sum);
			
	}

}

//计算天数
public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2021;
		int month=7;
		int day=25;
		int i,sum=0;
		for(i=1;i<month;i++)
		{
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
			{
				sum=sum+31;
			}
			else if(i==2)
			{
				if(year%4==0) {
					sum=sum+28;
				}
				else {
					sum=sum+29;
				}
			}
			else if(i==4||i==6||i==9||i==11)
			{
				sum=sum+30;
			}
		}
		sum=sum+day;
		System.out.printf("这一天是这一年的%d天",sum);
	}

}

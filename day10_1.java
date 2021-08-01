//运用函数的计算天数
public class day10_1 {
	public int Date(int year,int month,int day) {
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
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day10_1 s=new day10_1();
//		int year=2021;
//		int month=7;
//		int day=25;
		int dateX;
		int dateY;
		dateX=s.Date(20201,7,25);
		System.out.println(dateX);
		dateY=s.Date(2021,6,1);
		System.out.println(dateY);
	}

}

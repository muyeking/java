//用函数，数组计算天数
public class day10_3 {
	public int Date(int year,int month,int day) {
		int mat[]={31,29,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		//n=month-1;
		for(int n=0;n<month-1;n++)
		{
			sum=sum+mat[n];
		}
		if(year%4==0&&month>2) {
			sum=sum+day-1;
		}
		else {
			sum=sum+day;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day10_3 s=new day10_3();
		System.out.println(s.Date(2021, 7, 25));
		System.out.println(s.Date(2021,6,1));
	}

}

//使用函数计算奖金
public class day10_2 {
	public double Jiangjin(double l) {
		double a=0;
		if(l<=10) {
			a=l*0.1;
		}
		else if(l>10&&l<=20) {
			a=1+(l-10)*0.075;
		}
		else if(l>20&&l<=40) {
			a=1+10*0.075+(l-20)*0.05;
		}
		else if(l>40&&l<=60) {
			a=1+10*0.075+20*0.05+(l-40)*0.03;
		}
		else if(l>60&&l<=100) {
			a=1+10*0.075+20*0.05+20*0.03+(l-60)*0.015;
		}
		else if(l>100) {
			a=1+10*0.075+20*0.05+20*0.03+40*0.015+(l-100)*0.01;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day10_2 s=new day10_2();
		double a;
		a=s.Jiangjin(30);
		System.out.println(a);
	}

}

//continue,多次调用函数
public class day8_2 {
	public int staticNum(String s) {
		int i=0;
		int sumNum=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				sumNum++;		
			}
		}
		return sumNum;
	}
	public int Zimu(String s) {
		int i=0;
		int sumNum=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				sumNum++;
				
			}
			else if(c>='A'&&c<='Z') {
				sumNum++;
			}
		}
		
		return sumNum;
	}
	public int Kongge(String s) {
		int i=0;
		int sumNum=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
				sumNum++;
				
			}
		}
		return sumNum;
	}
	public int Qita(String s) {
		System.out.println(s);
		int i=0;
		int sumNum=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ')
				continue;
			else if(c>='A'&&c<='Z')
				continue;
			else if(c>='a'&&c<='z')
				continue;
			else if(c>='0'&&c<='9')
				continue;
			sumNum++;
		}
		
		return sumNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day8_2 s=new day8_2();
		String x="AaZz @ 123 ";
		String y="aBC 1 2 3";
		String z="xbdb964ADV dhhewi ";
		int sumNumX=1;
		int sumNumY=2;
		int sumNumZ=3;
		int zimuX=4;
		int konggeX=5;
		int qitaX=6;
		qitaX=s.Qita(x);
		konggeX=s.Kongge(x);
		zimuX=s.Zimu(x);
		sumNumX=s.staticNum(x);
		sumNumY=s.staticNum(y);
		sumNumZ=s.staticNum(z);
		System.out.println(sumNumX);
//		System.out.println(sumNumY);
//		System.out.println(sumNumZ);
		System.out.println(zimuX);
		System.out.println(konggeX);
		System.out.println(qitaX);
		System.out.printf("分别有:%d个数字%d个英文字母%d个空格%d个其它字符",sumNumX,zimuX,konggeX,qitaX);
	}

}

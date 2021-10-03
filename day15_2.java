//返回字符数组
public class day15_2 {
	public int Min(String s,String m,String n) {
		int a;
		if(s.length()>=m.length()) {
			a=m.length();
		}
		else
			a=s.length();
		if(a>=n.length()) {
			a=n.length();
		}
		return a;
	}
	public char[] ZiFu(String s,String m,String n) {
		char matX[]=new char[s.length()];
		char matY[]=new char[m.length()];
		char matZ[]=new char[n.length()];
		for(int i=0;i<s.length();i++) {
			matX[i]=s.charAt(i);
		}
		for(int i=0;i<m.length();i++) {
			matY[i]=m.charAt(i);
		}
		for(int i=0;i<n.length();i++) {
			matZ[i]=n.charAt(i);
		}
		int i=0;
		char nn[]=new char[Min(s,m,n)];
		for(i=0;i<Min(s,m,n);i++) {
			if(matX[i]==matY[i]&&matX[i]==matZ[i]) {
				//System.out.print(matX[i]);
				nn[i]=matX[i];
			}
			else { 
				break;
			}
		}
		System.out.println(i);
		char nx[]=new char[i];
		for(int j=0;j<i;j++) {
			nx[j]=nn[j];
		}
		return nx;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day15_2 a=new day15_2();
//		day15_1 b=new day15_1();
//		day15_1 c=new day15_1();
		String s="flower";
		String m="flow";
		String n="flight";
		char t[]=a.ZiFu(s, m, n);
		for(int i=0;i<t.length;i++) {
			System.out.print(t[i]);
		}
		//System.out.print(t.length);
	}
}

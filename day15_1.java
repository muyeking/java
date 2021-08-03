//¹«¹²×Ö·û£¬·µ»Øvoid
public class day15_1 {
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
	public void ZiFu(String s,String m,String n) {
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
		
		for(int i=0;i<Min(s,m,n);i++) {
			if(matX[i]==matY[i]&&matX[i]==matZ[i]) {
				System.out.print(matX[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day15_1 a=new day15_1();
//		day15_1 b=new day15_1();
//		day15_1 c=new day15_1();
		String s="flower";
		String m="flow";
		String n="flight";
		a.ZiFu(s, m, n);
	}
}

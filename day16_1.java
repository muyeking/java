//返回最长公共字符串
public class day16_1 {

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
	public String ZiFu(String s,String m,String n) {
		int i=0;
		StringBuffer res=new StringBuffer(Min(s,m,n));
		for(i=0;i<Min(s,m,n);i++) {
			if(s.charAt(i)==m.charAt(i)&&s.charAt(i)==n.charAt(i)) {
				res.append(s.charAt(i));
			}
			else { 
				break;
			}
		}

		return res.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day16_1 a=new day16_1();
		String s="flower";
		String m="flow";
		String n="flight";
	    System.out.println(a.ZiFu(s, m, n));
	}
}

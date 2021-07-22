
public class day7_2 {
	public char GetScoreLevel(int n) {
		if(n>=90) {
			return 'A';
		}
		else if(n<90&&n>=60) {
			return 'B';
		}
		else if(n<60) {
			return 'C';
		}
		return 'D';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day7_2 s=new day7_2();
		int n=88;
		int result=5;
		result=s.GetScoreLevel(n);
		if(result=='A') {
			System.out.printf("%d ",n);
			System.out.println("A");
		}
		else if(result=='B') {
			System.out.printf("%d ",n);
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
	}

}

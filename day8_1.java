//ͳ����ĸ�ո�����
public class day8_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aAZz @ 123 ";
		int i=0;
		int j=0;
		int k=0;
		int n=0;
		int m=0;
		for( ;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>'0'&&c<'9') {
				j++;	
			}
			else if(c>='a'&&c<='z') {
				k++;
			}
			else if(c>='A'&&c<='Z') {
				k++;
			}
			else if(c==' ') {
				n++;
			}
			else {
				m++;
			}
		}
		System.out.printf("%d\n",s.length());
		System.out.printf("�ֱ���:%d������%d��Ӣ����ĸ%d���ո�%d�������ַ�",j,k,n,m);
	}

}

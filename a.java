//1234组成多少不同三位数
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d=0;
		for(a=1;a<5;a++)
		{
			for(b=1;b<5;b++)
			{
				for(c=1;c<5;c++)
				{
					if(b!=a&&c!=a&&c!=b) {
						System.out.printf("%d\n",a*100+b*10+c);
					    d++;
					}
			    }
		    }
		
	    }
		System.out.println("ÄÜ×é³É"+d+"¸öÊý");
	}
}

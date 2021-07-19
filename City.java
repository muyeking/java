
public class City {
	public String name;
	public int latitude;
	public int longitude;
	public void Daying(){
		System.out.println(this.name+","+this.latitude+","+this.longitude);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			City bj=new City();
			bj.name="Beijing";
			bj.latitude=28;
			bj.longitude=118;		
			bj.Daying();
			City cs=new City();
			cs.name="Changsha";
			cs.latitude=80;
			cs.longitude=90;
			cs.Daying();
	}
}

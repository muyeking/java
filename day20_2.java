public class Person {

	private String name;
	private String petname;
	public int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

}
public class animal{
	private String name;

}
// 这里必须去掉Public  一个文件中只能有一个Public
class Main {
	public static void main(String[] args) {
		Person ming = new Person();
		ming.setName("小红");
		ming.setAge(5);
		System.out.println(ming.getName());
		System.out.println(ming.getAge());
	}

}


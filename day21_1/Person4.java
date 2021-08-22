//解决Person2改成private无法访问
public class Person4{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Test{
    public static void main(String[] args) {
        Person4 m=new Person4();
        String n;
        m.setName("小明");
        m.setAge(19);
        int x;
        x=m.getAge();
        n=m.getName();
        System.out.println(n);
        System.out.println(x);
        // Person3 w=new Person3();
        // m.setName("小王");
        // String s;
        // s=m.getName();
        // System.out.println(s);
    }
}
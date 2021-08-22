//解决Person2改成private无法访问
public class Person3{
    private String name;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args) {
        Person3 m=new Person3();
        String n;
        m.setName("小明");
        n=m.getName();
        System.out.println(n);
        Person3 w=new Person3();
        m.setName("小王");
        String s;
        s=m.getName();
        System.out.println(s);
    }
}
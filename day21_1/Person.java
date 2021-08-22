//public和private的区别运用
public class Person{
    public String name;
    
}
class Test{
    public static void main(String[] args) {
        Person m=new Person();
        m.name="小明";
        System.out.println(m.name);
    }
}
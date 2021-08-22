//public和private的区别运用
public class Person2{
    private String name;
    
}
class Test{
    public static void main(String[] args) {
        Person2 m=new Person2();
        m.name="小明";
        System.out.println(m.name);
    }
}
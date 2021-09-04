//构造函数的定义方法
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
class Test {
    public static void main(String[] args) {
        Person p = new Person("Xiao Ming", 15);//按之前的方法调用
        // Person p1=new Person();

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

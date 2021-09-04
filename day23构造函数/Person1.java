//不同参数的构造函数
public class Person1 {
    private String name;
    private int age;
    public Person1(String name){
        this.name=name;
        this.age=19;
    }
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person1(){

    }
    // public void setName(String name){
    //     this.name=name;
    // }
    
    public String getName() {
        return this.name;
    }
    // public void setAge(int age){
    //     this.age=age;
    // }

    public int getAge() {
        return this.age;
    }
    
}
class Test {
    public static void main(String[] args) {
        Person1 p = new Person1("Xiao Ming", 15);//按之前的方法调用
        Person1 h=new Person1("Xiao Hong"); 
        Person1 p1=new Person1();
        // p1.setName("Xiao Ming");
        // p1.setAge(15);
        // System.out.println(p1.getName());
        // System.out.println(p1.getAge());
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}

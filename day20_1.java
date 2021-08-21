//多个构造函数
public class day20_1 {
    private String name;
    private int age;

    public day20_1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public day20_1(String name){
        this.name=name;
        this.age=15;
    }
}
class Main {
    public static void main(String[] args) {
        day20_1 p = new day20_1("Xiao Ming", 15);
        day20_1 s=new day20_1("Xiao Hong",15);
        day20_1 XiaoHua=new day20_1("XiaoHua");
        System.out.println(XiaoHua.getName());
        System.out.println(p.getAge());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}




public class Main{
    public static void main(String[] args) {
        Student s=new Student("小明",18,100);
        Student h=new Student("小红",19,99);
        System.out.println(s.hello());
        System.out.println(h.hello());
        Person w=new Person("小王",19);
        System.out.println(w.Hello());
    }
}
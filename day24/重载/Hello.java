//定义一个Hello类，他有一个printHello的方法，对printHello方法进行重载：
//1. 无参数时 打印hello ,word !
//2. 传入name参数时  ，打印hello , name
public class Hello{
    public void printHello(){
        System.out.println("hello,world"+"!");
    }
    public void printHello(String name){
        System.out.println("hello"+name);
    }
}
//class Test{
    // public static void main(String[] args) {
    //     Hello m=new Hello();
    //     m.printHello();
    //     m.printHello("小明");
    //}
//}

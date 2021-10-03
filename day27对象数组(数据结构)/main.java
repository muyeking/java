//主函数
public class main{
    public static void main(String[] args){
        int n=10,size=50;
        Integer[] values=Array1.random(n,size);  //通过类名调用类的静态方法
        System.out.print(n+"个元素0~"+size+"之间的随机数序列：");
        Array1.print(values);
    }
}
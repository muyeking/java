// //算法描述
// T search(T key) {   
//     for(T elem:this数据结构){//遍历this数据结构，变量elem引用其中的每个元素
//         if(key与elem元素相等){//由T类型提供比较元素相等的方法
//             return elem;//查找成功，返回元素
//         }
//     }
//     return null;//遍历完成，查找不成功，返回查找不成功标记
// }

// //辗转相除法
// // gcd(x,y)=gcd(y,x)
// // gcd(x,y)=gcd(-x,y)
// // gcd(x,0)=|x|
// // gcd(x,y)=gcd(y,x%y)//0<=x%y递推公式
// public static int gcd(int x,int y){
//     while(y!=0){
//         int temp=x%y;
//         x=y;
//         y=temp;
//     }
//     return x;
// }

//声明数组类
public class Array1{
    public static void print(Object[] values){            //输出对象数组元素，以空格分隔元素
        for(Object obj :values){       //逐元循环，obj逐个引用values数组元素，次序同数组
            System.out.println(obj==null?"null":""+obj.toString());
        }
        System.out.println();     
    }
    //生成n个随机数（可重复），范围是0~size-1,返回整数对象
    public static Integer[] random(int n,int size)
    {
        Integer[] values=new Integer[n];     //java.lang.Integer是int类型的包装类
        for(int i=0;i<values.length;i++){    //遍历数组，访问每个元素仅一次
            //java.lang.Math.random()方法生成一个0-1之间double类型的随机数
         //   values[i]=new Integer((int)(Math.random()*size));
            values[i]=(int)(Math.random()*size+50);
          //  System.out.print(Math.random()*size);
        }
        return values;  //返回数组引用
    }
}


    

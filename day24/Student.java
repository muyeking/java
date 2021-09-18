//练习构造函数
public class Student{
    private String name;
    private int Mathscore;
    private int Englishscore;
    private int average;
    private int all;
    public Student(String name,int Englishscore,int Mathscore){
        this.name=name;
        this.Englishscore=Englishscore;
        this.Mathscore=Mathscore;
        this.average=(Englishscore+Mathscore)/2;
        this.all=Englishscore+Mathscore;
    }
    public String getName(){
        return this.name;
    }
    public int getEnglishscore(){
        return this.Englishscore;
    }
    public int getMathscore(){
        return this.Mathscore;
    }
    public int getaverage(){
        return this.average;
    }
    public int getall(){
        return this.all;
    }
}
class Test{
    public static void main(String[] args){
        Student m=new Student("小明",90,70);
        Student h=new Student("小华",88,90);
        System.out.printf("姓名 数学成绩 英语成绩   平均分  总分\n");
        System.out.printf("%s    %d       %d        %d     %d\n",m.getName(),m.getMathscore(),m.getEnglishscore(),m.getaverage(),m.getall());
        System.out.printf("%s    %d       %d        %d     %d\n",h.getName(),h.getMathscore(),h.getEnglishscore(),h.getaverage(),h.getall());
    }
}

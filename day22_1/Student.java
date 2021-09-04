//定义一个Student类 有name  score，打印出该班级所有学生的姓名和成绩
public class Student {
    private String name;
    private int Mathscore;
    private int Englishscore;
    private int average;
    private int all;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getMathscore(){
        return Mathscore;
    }
    public void setMathscore(int Mathscore){
        this.Mathscore=Mathscore;
    }
    public int getEnglishscore(){
        return Englishscore;
    }
    public void setEnglishscore(int Englishscore){
        this.Englishscore=Englishscore;
    }
    public int getaverage(){
        return (this.Englishscore+this.Mathscore)/2;
    } 
    public int getall(){
        return this.Englishscore+this.Mathscore;
    }
    
}

class Test{
    public static void main(String[] args) {
        Student m=new Student();
        Student h=new Student();
        String x,y;
        m.setName("小明");
        h.setName("小华");
        x=m.getName();
        y=h.getName();
        int a,b,c,d,mingAll,huaAll;
        int mingAverage,huaAverage;
        m.setMathscore(90);
        h.setMathscore(88);
        m.setEnglishscore(70);
        h.setEnglishscore(90);
        mingAll=m.getall();
        huaAll=h.getall();
        mingAverage=m.getaverage();
        huaAverage=h.getaverage();
        System.out.printf("姓名 数学成绩 英语成绩   平均分  总分\n");
        System.out.printf("%s    %d       %d       %d     %d\n",x,m.getMathscore(),m.getEnglishscore(),mingAverage,mingAll);
        System.out.printf("%s    %d       %d       %d     %d\n",y,h.getMathscore(),h.getEnglishscore(),huaAverage,huaAll);
    }
}

public class Student {
    private String name;
    private int Mathscore;
    private int Englishscore;
//    private int average;
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
    // private int getaverage(){
    //     return average;
    // }
    // private void setaverage(){
    //     this.average=average;
    // }
    public int getall(){
        return this.Englishscore+this.Mathscore;
    }
    // private void setall( ){
    //     this.all=all;
    // }
    // public int all(int a,int b){
    //     all=a+b;
    //     return all;
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
        m.setMathscore(90);
        h.setMathscore(88);
        m.setEnglishscore(70);
        h.setEnglishscore(90);
        mingAll=m.getall();
        huaAll=h.getall();
        System.out.printf("姓名 数学成绩 英语成绩  总分\n");
        System.out.printf("%s    %d       %d      %d\n",x,m.getMathscore(),m.getEnglishscore(),mingAll);
        System.out.printf("%s    %d       %d      %d\n",y,h.getMathscore(),h.getEnglishscore(),huaAll);
    }
}

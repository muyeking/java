class Student extends Person {
    private int score;
    public String hello() {
        return name+" "+age+" "+score; // 编译错误：无法访问name字段
    }
    public Student(String name,int age,int score){
        // this.name=name;
        // this.age=age;
        super(name,age);
        this.score=score;
    }
    
}
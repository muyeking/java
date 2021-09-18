class Student extends Person {
    public String hello() {
        return "Hello, " + name+" "+age; // 编译错误：无法访问name字段
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
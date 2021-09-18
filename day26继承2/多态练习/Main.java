public class Main {
    public static void main(String[] args) {
        Salary xiaoming=new Salary();
        xiaoming.setIncome(6000);
        //xiaoming.getIncome()
        System.out.println(xiaoming.getTax());
        Income xiaohong=new Income();
        xiaohong.setIncome(6000);
        System.out.println(xiaohong.getTax());
        Income xiaojun=new Salary();
        xiaojun.setIncome(6000);
        System.out.println(xiaojun.getTax());
    }
}   

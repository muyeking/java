public class Income{
    protected double income;
    public void setIncome(double income){
        this.income=income;
    } 
    public double getIncome(){
        return this.income;
    } 
    public double getTax(){
        return income*0.1;
    }
    
}

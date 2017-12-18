/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

/**
 *
 * @author jit
 */
public  class Invoice {
    
    
    private double paidMoney;
     private  double total ; 
    private  double remainingMoney ;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
     public  double calaulateInvoice(double paidMoney , double total  ){
        remainingMoney  = total - paidMoney;
         setRemainingMoney(remainingMoney);
        return getRemainingMoney();
     }
  
   
  public void setPaidMoney(double paidMoney){
      this.paidMoney = paidMoney;
  }
  public void setTotal(double total){
      this.total = total;
  }
  public void setRemainingMoney(double remainingMoney){
      this.remainingMoney = remainingMoney;
  }
  
   public double getPaidMoney(){
    return this.paidMoney;   
   }
   public double getRemainingMoney(){
         return this.remainingMoney;
   }
    public double getTotal(){
          return this.total;
    }
      public double calculateInvoice(double paidMoney , double total ){
          setRemainingMoney(total - paidMoney);
          return getRemainingMoney();
      }
}
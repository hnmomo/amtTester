/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmtester;

/**
 *
 * @author jihua5758
 */
public class ATM {
    //fields
    private String bank;
    private int money;
    //constructer
    public ATM(String b,int m){
        bank=b;
        money=m;
    }
    //methods
    /**withdraw method
     * pre:withdraw value more than 0, integer
     * post:subtract money from current balance
     */
    public void withdraw(int w){
        if(w>0){
            money-=w;
            System.out.println("you took $"+w+" from your balance");
        }else{
            System.out.println("input positive number");
        }
    }
    /**deposit method
     * pre:value more than 0, integer
     * post:add money from current balance
     */
    public void deposit(int w){
        if(w>0){
            money+=w;
            System.out.println("you sent $"+w+" to your balance");
        }else{
            System.out.println("input positive number");
        }
    }
    /**to string
     * post:return current balance
     */
    public String toString(){
        return String.valueOf("welcome to "+bank+", your balance is $"+money);
    }
    /**interest calculation
     * pre:day number and interest rate more than 0
     * post:add interest to balance
     */
    public void interest(double in,int day){
        System.out.println("your interest is:"+money*Math.pow((1+in),day));
        money=(int)(money*Math.pow((1+in),day));
    }
}

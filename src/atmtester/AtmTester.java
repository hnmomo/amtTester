/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmtester;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class AtmTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input your bank name");
        String bank=in.nextLine();
        System.out.println("input your balance(integer)");
        int money=in.nextInt();
        ATM myAtm=new ATM(bank,money);
        int c;
        do{
            System.out.println("1-deposit\n2-withdraw\n3-check balance\n4-daily interest\n0-exit");
            c=in.nextInt();
            switch(c){
                case 1:
                    System.out.println("input deposit amount");
                    myAtm.deposit(in.nextInt());
                    break;
                case 2:
                    System.out.println("input withdraw amount");
                    myAtm.withdraw(in.nextInt());
                    break;
                case 3:
                    System.out.println(myAtm);
                    break;
                case 4:
                    System.out.println("input interest rate");
                    double i=in.nextDouble();
                    System.out.println("input day number");
                    myAtm.interest(i,in.nextInt());
            }
        }while(c!=0);
    }
    
}

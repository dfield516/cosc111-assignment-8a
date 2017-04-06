 package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mochan
 */
public class CarLoanData {

    int carprice;
    int loanlen;
    double expreturn;
    double APR;

    public int getCarprice() {
        return carprice;
    }

    public int getLoanlen() {
        return loanlen;
    }

    public double getExpreturn() {
        return expreturn;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public void setLoanlen(int loanlen) {
        this.loanlen = loanlen;
    }

    public void setExpreturn(double expreturn) {
        this.expreturn = expreturn;
    }

    public double getMonthlyPayment()
    {
        return (double)carprice / (double)loanlen;
    }
    
    public double getAPR()
    {
        return APR;
    }
    
    public void setAPR(double APR)
    {
        this.APR = APR;
    
    }
    public double getTotalWithAPR()
    {
        return (double) loanlen; 
    }
    public double TotalInt()
    {
        double intrest = carprice;
        double totalIntrest = 0;
        //return 2;
        for(int i=1; i<=loanlen; i++)
        {
            
            
            intrest = intrest - getMonthlyPayment();
            intrest = intrest * (1 + (expreturn*0.01/12));
            
        }
        totalIntrest = intrest;
    return totalIntrest;
    }
}
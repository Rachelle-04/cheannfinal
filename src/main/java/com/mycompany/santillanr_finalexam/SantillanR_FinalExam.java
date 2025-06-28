/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.santillanr_finalexam;

/**
 *
 * @author Janine Rachelle
 */
public class SantillanR_FinalExam {
    
    public double compute(double hw, double hr, int tp, double lp){
        double grosspay = hw * hr;
        double tax = grosspay * tp * .01;
        double total = grosspay - tax;
        double netpay = total - lp;
        return netpay;
    }
    
    public double compute(double hw, double hr, int tp){
        double grosspay = hw * hr;
        double tax = grosspay * tp * .01;
        double total = grosspay - tax;
        return total;
    }
}

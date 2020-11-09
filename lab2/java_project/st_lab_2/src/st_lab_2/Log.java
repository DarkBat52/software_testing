/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st_lab_2;


public class Log implements iLog{
    private ILnx lnx;
    
    public void set_error_tolerance(double error_tolerance){
        lnx.set_error_tolerance(error_tolerance);
    }
    
    public Log(ILnx lnx){
        this.lnx = lnx;
    }
    
    public Log(){
        lnx = new Lnx();
    }
    
    public double ln(double x){
        return lnx.func(x);
    }
    
    public double log_2(double x){
        return ln(x)/ln(2);
    }
    
    public double log_3(double x){
        return ln(x)/ln(3);
    }
    
    public double log_5(double x){
        return ln(x)/ln(5);
    }
    
    public double log_10(double x){
        return ln(x)/ln(10);
    }
}

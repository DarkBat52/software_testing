/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st_lab_2;

public class Lnx implements ILnx{
    
    double error_tolerance = 0.0000001;
    
    public void set_error_tolerance(double error_tolerance){
        this.error_tolerance = error_tolerance;
    }
    
    @Override
    public double func(double x){
        
        if (x < 0)
            return Double.NaN;
        
        int n = 0;
        
        while (x < 0.5 || x > 1.5){
            if (x < 0.5){
                x *= 2;
                n++;
            } else if (x > 1.5){
                x /= 2;
                n--;
            }
        }
        
        return n*ln(0.5, error_tolerance) + ln(x, error_tolerance);
    }
    
     private double ln(double x, double error_tolerance){
        
        if (x < 0)
            return Double.NaN;
        
        double res = 0;
        double nth_elem = x - 1;
        double n = 1;
        
        while (Math.abs(nth_elem) > error_tolerance){
            res += nth_elem;
            nth_elem *= (x-1)*(-1)*n/++n;
        }
        res += nth_elem;
        
        return res;
    }
    
}

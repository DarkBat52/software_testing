/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st_lab_2;

/**
 *
 * @author TheZo
 */
public class Trigon implements iTrigon{
    private ISinx sinx;
    
    public void set_error_tolerance(double error_tolerance){
        sinx.set_error_tolerance(error_tolerance);
    }
    
    public Trigon(){
        sinx = new Sinx();
    }
    
    public Trigon(ISinx sin){
        this.sinx = sin;
    }
    
    public double sin(double x){
        return sinx.func(x);
    }
    
    public double cos(double x){
        return sin(x - Math.PI/2);
    }
    
    public double sec(double x){
        return 1/cos(x);
    }
    
    public double csc(double x){
        return 1/sin(x);
    }
    
    public double tan(double x){
        return sin(x)/cos(x);
    }
    
    public double cot(double x){
        return cos(x)/sin(x);
    }
}

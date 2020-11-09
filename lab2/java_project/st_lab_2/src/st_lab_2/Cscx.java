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
public class Cscx implements ICscx{
    private Sinx sin;
    
    public Cscx(){
        sin = new Sinx();
    }
    
    public double func(double x){
        return 1/sin.func(x);
    }
}

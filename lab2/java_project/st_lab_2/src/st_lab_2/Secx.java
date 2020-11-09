/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st_lab_2;

public class Secx implements ISecx{
    ICosx cos;
    
    public Secx(){
        cos = new Cosx();
    }
    
    public double func(double x){
        return 1/cos.func(x);
    }
}

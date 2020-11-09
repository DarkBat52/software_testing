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
public class TheFunction implements IFunction{
    
    private iTrigon tri;
    private iLog log;
    
    public TheFunction(){
        tri = new Trigon();
        log = new Log();
    }
    
    public TheFunction(iTrigon tri, iLog log){
        this.tri = tri;
        this.log = log;
    }
    
    public double func(double x){
        
        if (x <= 0) {
            if (Math.abs(x % Math.PI) < 0.0000001){
                return 1;
            } 
            return (((((tri.sec(x) * tri.csc(x)) * tri.cos(x)) * tri.csc(x)) - 
                    ((tri.cot(x) / tri.cos(x)) / (tri.sin(x) + tri.csc(x)))) * 
                    (tri.tan(x) * tri.tan(x)));
        } else if (x > 0){
            return Math.pow((((log.log_10(x) + log.log_10(x)) - (log.log_2(x) * 
                    log.log_5(x))) / (log.log_10(x) + log.ln(x))) + 
                    log.log_3(x),2);
        }
        return Double.NaN;
    }
}

package st_lab_2;

public class Sinx implements ISinx{
    
    double error_tolerance = 0.00001;
    
    public void set_error_tolerance(double error_tolerance){
        this.error_tolerance = error_tolerance;
    }
    
    public double func(double x){
        double sign = 1;
        if (Math.abs(x/Math.PI) % 2 > 1){
            sign *= (-1);
        }
        x %= Math.PI;
        double res = 0;
        double nth_member = x;
        int n = 1;
        while (Math.abs(nth_member) > error_tolerance){
            res+= nth_member;
            nth_member *= x*x/++n/++n*(-1);
        } 
        res+= nth_member;
        return res*sign;
    }
}

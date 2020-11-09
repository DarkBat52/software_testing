package st_lab_2;

public class Cosx implements ICosx{
    
    ISinx sin;
    
    public Cosx(ISinx sinFunc){
        sin = sinFunc;
    }
    
    public Cosx(){
        sin = new Sinx();
    }
    
    @Override
    public double func(double x){
        return sin.func(x + Math.PI/2);
    }
}


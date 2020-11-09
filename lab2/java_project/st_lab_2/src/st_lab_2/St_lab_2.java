package st_lab_2;

import static java.lang.Math.PI;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class St_lab_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISinx sin = new Sinx();
        Lnx lnx = new Lnx();
        iTrigon tri = new Trigon();
        iLog log = new Log();
        
        tri.set_error_tolerance(0.00000000000001);
        log.set_error_tolerance(0.00000000000001);
        
        double tri_X[] = {-PI*5, -4.5*PI, -PI*1.5, -PI, -PI/3, -0.5, 0};
        double log_X[] = {0.05, 0.1, 0.1197, 0.6, 1, 2, 3, 5, 10, 20, 30, 50, 100};
        
        IFunction theFunc = new TheFunction();
        
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.sin(" + tri_X[i] +")).thenReturn("+ tri.sin(tri_X[i]) +");");
        }
        
        System.out.println();
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.cos(" + tri_X[i] +")).thenReturn("+ tri.cos(tri_X[i]) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.sec(" + tri_X[i] +")).thenReturn("+ 1/Math.cos(tri_X[i]) +");");
            
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.csc(" + tri_X[i] +")).thenReturn("+ 1/Math.sin(tri_X[i]) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.tan(" + tri_X[i] +")).thenReturn("+ Math.tan(tri_X[i]) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(tri.cot(" + tri_X[i] +")).thenReturn("+ 1/Math.tan(tri_X[i]) +");");
        }
        
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(log.ln(" + log_X[i] +")).thenReturn("+ log.ln(log_X[i]) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(log.log_2(" + log_X[i] +")).thenReturn("+ Math.log(log_X[i])/Math.log(2) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(log.log_3(" + log_X[i] +")).thenReturn("+ Math.log(log_X[i])/Math.log(3) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(log.log_5(" + log_X[i] +")).thenReturn("+ Math.log(log_X[i])/Math.log(5) +");");
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(log.log_10(" + log_X[i] +")).thenReturn("+ Math.log10(log_X[i]) +");");
        }
        
         System.out.println("------------------------------The Func--------------------------------");
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("theFunc(" + tri_X[i] +") = "+ theFunc.func(tri_X[i]) +".");
        }
        
        System.out.println("------------------------------The Func--------------------------------");
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("theFunc(" + log_X[i] +") = "+ theFunc.func(log_X[i]) +".");
        }
        
        theFunc.func(PI);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        for (int i = 0;i < tri_X.length; ++i){
            System.out.println("when(sin.func(" + tri_X[i] +")).thenReturn("+ Math.sin(tri_X[i]) +");");
        }
        
        System.out.println();
        System.out.println();
        
        for (int i = 0;i < log_X.length; ++i){
            System.out.println("when(ln.func(" + log_X[i] +")).thenReturn("+ Math.log(log_X[i]) +");");
        }
        
        try{
            File f = new File("C:\\Users\\TheZo\\Desktop\\ForUniversity\\Bachelor\\Year4\\software_testing\\lab2\\res.csv");
            if(!f.exists())
                f.createNewFile();
            FileWriter writer = new FileWriter(f);
            for (double i = -10; i <= 10; i+=0.01){
                writer.append(i + "," + theFunc.func(i) + "\n");
            }
        } catch (IOException e){
            System.out.println("error");
        }
        
        for (double i = -10; i <= 10; i+=0.01){
            
        }
        
        //System.out.println(Math.log(0.5));
    }
    
}

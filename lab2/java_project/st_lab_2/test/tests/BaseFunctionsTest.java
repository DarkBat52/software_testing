package tests;

import static java.lang.Math.PI;
import junit.framework.Assert;
import st_lab_2.*;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class BaseFunctionsTest extends theTest{
    ISinx sin;
    
    @Before
    public void mockBaseFunctions(){
        
        sin = mock(Sinx.class);
        ILnx ln = mock(Lnx.class);
        
        when(sin.func(-15.707963267948966)).thenReturn(-0.0);
        when(sin.func(-14.137166941154069)).thenReturn(-1.0);
        when(sin.func(-4.71238898038469)).thenReturn(1.0);
        when(sin.func(-3.141592653589793)).thenReturn(-0.0);
        when(sin.func(-PI/3)).thenReturn(-0.8660254037844385);
        when(sin.func(-0.5)).thenReturn(-0.479425538604203);
        when(sin.func(0.0)).thenReturn(0.0);
        
        when(ln.func(0.05)).thenReturn(-2.995732273553991);
        when(ln.func(0.1)).thenReturn(-2.3025850929940455);
        when(ln.func(0.1197)).thenReturn(-2.1227666664182094);
        when(ln.func(0.6)).thenReturn(-0.5108256237659907);
        when(ln.func(1.0)).thenReturn(0.0);
        when(ln.func(2.0)).thenReturn(0.6931471805599453);
        when(ln.func(3.0)).thenReturn(1.0986122886681098);
        when(ln.func(5.0)).thenReturn(1.6094379124341003);
        when(ln.func(10.0)).thenReturn(2.302585092994046);
        when(ln.func(20.0)).thenReturn(2.995732273553991);
        when(ln.func(30.0)).thenReturn(3.4011973816621555);
        when(ln.func(50.0)).thenReturn(3.912023005428146);
        when(ln.func(100.0)).thenReturn(4.605170185988092);
        
        iLog log = new Log(ln);
        iTrigon tri = new Trigon(sin);
        theFunc = new TheFunction(tri, log);
    }
    
     void preciseAssertEquals(double res, double expected_res){
        Assert.assertEquals(expected_res, res, error_tolerance);
    }
    
    @Test
    public void testTheFuncPositiveX(){
        preciseAssertEquals(theFunc.func(0.05), 0.06199689209616769);
        preciseAssertEquals(theFunc.func(0.1), 0.002627692429045844);
        preciseAssertEquals(theFunc.func(0.1197), 0.0);
        preciseAssertEquals(theFunc.func(0.6), 0.21147627771903885);
        preciseAssertEquals(theFunc.func(1), Double.NaN);
        preciseAssertEquals(theFunc.func(3), 0.8445279772708125);
        preciseAssertEquals(theFunc.func(5), 1.133591995043943);
        preciseAssertEquals(theFunc.func(10), 1.5937383460793135);
        preciseAssertEquals(theFunc.func(20), 2.1320795791387743);
        preciseAssertEquals(theFunc.func(30), 2.4832379565033977);
        preciseAssertEquals(theFunc.func(50), 2.9637345191544693);
        preciseAssertEquals(theFunc.func(100), 3.6836386450279486); 
    }
    
    double tri_X[] = {-PI*5, -4.5*PI, -PI*1.5, -PI, 0};
    double expected_tri_res[] = {1.0, Double.NaN, Double.NaN, 1.0, 1.0};
    
    TheFunction func = new TheFunction(new Trigon(), new Log());
    
    @Test
    public void testTheFuncNegativeX(){
        for (int i = 0; i < tri_X.length; ++i){
            preciseAssertEquals(theFunc.func(tri_X[i]), expected_tri_res[i]);
        }
    }
}

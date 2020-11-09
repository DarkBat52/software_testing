package tests;

import st_lab_2.*;

import static java.lang.Math.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TheFunctionTest extends theTest{
    
    
    
    @Before
    public void mockBaseFunctions(){
        iTrigon tri = mock(Trigon.class);
        iLog log = mock(Log.class);
        
        when(tri.sin(-15.707963267948966)).thenReturn(-6.123233995736766E-16);
        when(tri.sin(-14.137166941154069)).thenReturn(-1.0);
        when(tri.sin(-4.71238898038469)).thenReturn(1.0);
        when(tri.sin(-3.141592653589793)).thenReturn(-1.2246467991473532E-16);
        when(tri.sin(-1.0471975511965976)).thenReturn(-0.8660254037844386);
        when(tri.sin(-0.5)).thenReturn(-0.479425538604203);
        when(tri.sin(0.0)).thenReturn(0.0);

        when(tri.cos(-15.707963267948966)).thenReturn(-1.0);
        when(tri.cos(-14.137166941154069)).thenReturn(0.0);
        when(tri.cos(-4.71238898038469)).thenReturn(0.0);
        when(tri.cos(-3.141592653589793)).thenReturn(-1.0);
        when(tri.cos(-1.0471975511965976)).thenReturn(0.5000000000000001);
        when(tri.cos(-0.5)).thenReturn(0.8775825618903728);
        when(tri.cos(0.0)).thenReturn(1.0);
        
        when(tri.sec(-15.707963267948966)).thenReturn(-1.0);
        when(tri.sec(-14.137166941154069)).thenReturn(1.814582150355041E15);
        when(tri.sec(-4.71238898038469)).thenReturn(-5.443746451065123E15);
        when(tri.sec(-3.141592653589793)).thenReturn(-1.0);
        when(tri.sec(-1.0471975511965976)).thenReturn(1.9999999999999996);
        when(tri.sec(-0.5)).thenReturn(1.139493927324549);
        when(tri.sec(0.0)).thenReturn(1.0);
        
        when(tri.csc(-15.707963267948966)).thenReturn(-1.6331239353195368E15);
        when(tri.csc(-14.137166941154069)).thenReturn(-1.0);
        when(tri.csc(-4.71238898038469)).thenReturn(1.0);
        when(tri.csc(-3.141592653589793)).thenReturn(-8.165619676597685E15);
        when(tri.csc(-1.0471975511965976)).thenReturn(-1.1547005383792517);
        when(tri.csc(-0.5)).thenReturn(-2.085829642933488);
        when(tri.csc(0.0)).thenReturn(Double.POSITIVE_INFINITY);
        
        when(tri.tan(-15.707963267948966)).thenReturn(6.123233995736766E-16);
        when(tri.tan(-14.137166941154069)).thenReturn(-1.814582150355041E15);
        when(tri.tan(-4.71238898038469)).thenReturn(-5.443746451065123E15);
        when(tri.tan(-3.141592653589793)).thenReturn(1.2246467991473532E-16);
        when(tri.tan(-1.0471975511965976)).thenReturn(-1.7320508075688767);
        when(tri.tan(-0.5)).thenReturn(-0.5463024898437905);
        when(tri.tan(0.0)).thenReturn(0.0);
        
        when(tri.cot(-15.707963267948966)).thenReturn(1.6331239353195368E15);
        when(tri.cot(-14.137166941154069)).thenReturn(-0.0);
        when(tri.cot(-4.71238898038469)).thenReturn(-0.0);
        when(tri.cot(-3.141592653589793)).thenReturn(8.165619676597685E15);
        when(tri.cot(-1.0471975511965976)).thenReturn(-0.577350269189626);
        when(tri.cot(-0.5)).thenReturn(-1.830487721712452);
        when(tri.cot(0.0)).thenReturn(Double.POSITIVE_INFINITY);
        
        
        when(log.ln(0.05)).thenReturn(-2.995732273553991);
        when(log.ln(0.1)).thenReturn(-2.3025850929940455);
        when(log.ln(0.1197)).thenReturn(-2.1227666664182094);
        when(log.ln(0.6)).thenReturn(-0.5108256237659907);
        when(log.ln(1.0)).thenReturn(0.0);
        when(log.ln(2.0)).thenReturn(0.6931471805599453);
        when(log.ln(3.0)).thenReturn(1.0986122886681098);
        when(log.ln(5.0)).thenReturn(1.6094379124341003);
        when(log.ln(10.0)).thenReturn(2.302585092994046);
        when(log.ln(20.0)).thenReturn(2.995732273553991);
        when(log.ln(30.0)).thenReturn(3.4011973816621555);
        when(log.ln(50.0)).thenReturn(3.912023005428146);
        when(log.ln(100.0)).thenReturn(4.605170185988092);
        
        when(log.log_2(0.05)).thenReturn(-4.321928094887363);
        when(log.log_2(0.1)).thenReturn(-3.321928094887362);
        when(log.log_2(0.1197)).thenReturn(-3.062504942605947);
        when(log.log_2(0.6)).thenReturn(-0.7369655941662062);
        when(log.log_2(1.0)).thenReturn(0.0);
        when(log.log_2(2.0)).thenReturn(1.0);
        when(log.log_2(3.0)).thenReturn(1.5849625007211563);
        when(log.log_2(5.0)).thenReturn(2.321928094887362);
        when(log.log_2(10.0)).thenReturn(3.3219280948873626);
        when(log.log_2(20.0)).thenReturn(4.321928094887363);
        when(log.log_2(30.0)).thenReturn(4.906890595608519);
        when(log.log_2(50.0)).thenReturn(5.643856189774724);
        when(log.log_2(100.0)).thenReturn(6.643856189774725);
        
        when(log.log_3(0.05)).thenReturn(-2.7268330278608417);
        when(log.log_3(0.1)).thenReturn(-2.0959032742893844);
        when(log.log_3(0.1197)).thenReturn(-1.9322254887497405);
        when(log.log_3(0.6)).thenReturn(-0.4649735207179272);
        when(log.log_3(1.0)).thenReturn(0.0);
        when(log.log_3(2.0)).thenReturn(0.6309297535714574);
        when(log.log_3(3.0)).thenReturn(1.0);
        when(log.log_3(5.0)).thenReturn(1.4649735207179269);
        when(log.log_3(10.0)).thenReturn(2.095903274289385);
        when(log.log_3(20.0)).thenReturn(2.7268330278608417);
        when(log.log_3(30.0)).thenReturn(3.0959032742893844);
        when(log.log_3(50.0)).thenReturn(3.5608767950073115);
        when(log.log_3(100.0)).thenReturn(4.19180654857877);
        
        when(log.log_5(0.05)).thenReturn(-1.8613531161467862);
        when(log.log_5(0.1)).thenReturn(-1.430676558073393);
        when(log.log_5(0.1197)).thenReturn(-1.3189490877642835);
        when(log.log_5(0.6)).thenReturn(-0.31739380551401475);
        when(log.log_5(1.0)).thenReturn(0.0);
        when(log.log_5(2.0)).thenReturn(0.43067655807339306);
        when(log.log_5(3.0)).thenReturn(0.6826061944859854);
        when(log.log_5(5.0)).thenReturn(1.0);
        when(log.log_5(10.0)).thenReturn(1.4306765580733933);
        when(log.log_5(20.0)).thenReturn(1.8613531161467862);
        when(log.log_5(30.0)).thenReturn(2.1132827525593787);
        when(log.log_5(50.0)).thenReturn(2.4306765580733933);
        when(log.log_5(100.0)).thenReturn(2.8613531161467867);
        
        when(log.log_10(0.05)).thenReturn(-1.3010299956639813);
        when(log.log_10(0.1)).thenReturn(-1.0);
        when(log.log_10(0.1197)).thenReturn(-0.9219058495935893);
        when(log.log_10(0.6)).thenReturn(-0.2218487496163564);
        when(log.log_10(1.0)).thenReturn(0.0);
        when(log.log_10(2.0)).thenReturn(0.3010299956639812);
        when(log.log_10(3.0)).thenReturn(0.47712125471966244);
        when(log.log_10(5.0)).thenReturn(0.6989700043360189);
        when(log.log_10(10.0)).thenReturn(1.0);
        when(log.log_10(20.0)).thenReturn(1.3010299956639813);
        when(log.log_10(30.0)).thenReturn(1.4771212547196624);
        when(log.log_10(50.0)).thenReturn(1.6989700043360187);
        when(log.log_10(100.0)).thenReturn(2.0);
        
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
    
    double tri_X[] = {-PI*5, -4.5*PI, -PI*1.5, -PI, -PI/3, -0.5, 0};
    double expected_tri_res[] = {1.0, Double.NaN, Double.NaN, 1.0, 2.2857145134889345, 1.0557771354923535, 1.0};
    
    @Test
    public void testTheFuncNegativeX(){
        for (int i = 0; i < tri_X.length; ++i){
            preciseAssertEquals(theFunc.func(tri_X[i]), expected_tri_res[i]);
        }
    }
}



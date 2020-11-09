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
public interface iLog {
    public double ln(double x);
    public double log_2(double x);
    public double log_3(double x);
    public double log_5(double x);
    public double log_10(double x);
    public void set_error_tolerance(double error_tolerance);
}

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
public interface iTrigon{
    double sin(double x);
    double cos(double x);
    double sec(double x);
    double csc(double x);
    double tan(double x);
    double cot(double x);
    void set_error_tolerance(double error_tolerance);
}

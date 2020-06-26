/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dimentional2;

/**
 *
 * @author ASUS
 */
abstract class Base {
    protected double a,b,c;
    abstract protected void set_A(double a);
    abstract protected void set_B(double b);
    abstract protected void set_C();

    abstract protected double get_A();
    abstract protected double get_B();
    abstract protected double get_C();
    
    abstract protected void view(); 
}

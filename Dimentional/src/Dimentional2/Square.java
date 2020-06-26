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
public class Square extends Base{

    @Override
    protected void set_A(double a) {
       this.a=a;
    }

    @Override
    protected void set_B(double b) {
        this.b=b;
    }

    @Override
    protected void set_C() {
        double c;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
         double result = get_A()*get_B();
         return result;
    }

    @Override
    protected void view() {
        System.out.println("Luas persegi sebesar " + get_C());
    }
    
    
}

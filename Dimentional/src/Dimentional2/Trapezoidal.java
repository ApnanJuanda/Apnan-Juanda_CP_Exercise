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
public class Trapezoidal extends Base{

    private double h;
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trapezoidal other = (Trapezoidal) obj;
        if (Double.doubleToLongBits(this.h) != Double.doubleToLongBits(other.h)) {
            return false;
        }
        return true;
    }

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
       
    }
    
    protected void set_height(double h){
        this.h=h;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }
    
    protected double get_H(){
        return h;
    }

    @Override
    protected double get_C() {
        double result = ((get_A()+get_B())*get_H()) / 2;
        return result;
    }

    @Override
    protected void view() {
        System.out.println("Luas trapesium sebesar " + get_C());
    }
    
}

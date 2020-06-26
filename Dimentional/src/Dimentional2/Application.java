/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dimentional2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Application {
    public static void main(String[] args) {
       try{
        Integer choose1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("--------Jenis-jenis bangun datar--------");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Trapesium");
        System.out.println("5. Jajaran genjang");
        System.out.print("Pilih bangun datar: ");
  
        choose1 = input.nextInt();
        
        if(choose1 == 1){
                 operation_1();
            } else if(choose1 == 2){
                operation_2();
            } else if(choose1 == 3){
                operation_3();
            } else if(choose1 == 4){
                operation_4();
            } else if(choose1 == 5){
                operation_5();
            } else if(choose1 == 0){
              System.exit(0);
            } else System.out.println("Pilihan tidak ada"); main(args);
        } catch(Exception e){
            System.out.println("pilihan harus berupa angka");
            main(args);
        } 
    }
    
    private static void operation_1(){
            try{
            double number1, number2;
            Scanner input = new Scanner(System.in);
            Base Osquare = new Square();
            System.out.print("masukkan ukuran sisi1: ");
            number1 = input.nextDouble();
            System.out.print("masukkan ukuran sisi2: ");
            number2 = input.nextDouble();
           
            Osquare.set_A(number1);
            Osquare.set_B(number2);
            if(Osquare.get_A()==Osquare.get_B()){
                    Osquare.view();
                String[] args = null;
                    main(args);
                }
            else {
                    System.out.println("Kedua input harus sama");
                    operation_1();
                }
            } catch(Exception e){System.out.println("data input harus angka");
                operation_1();
            } 
        }
    
    private static void operation_2(){
            try{
            double number1, number2;
            Scanner input = new Scanner(System.in);
            Base Orectangle = new Rectangle();
            System.out.print("masukkan ukuran panjang: ");
            number1 = input.nextDouble();
            System.out.print("masukkan ukuran lebar: ");
            number2 = input.nextDouble();
           
            Orectangle.set_A(number1);
            Orectangle.set_B(number2);
            Orectangle.view();
                String[] args = null;
                main(args);
                
            } catch(Exception e){System.out.println("data input harus angka");
                operation_2();
            } 
    }
        
    
    private static void operation_3(){
        try {
            double number1, number2;
            Scanner input = new Scanner(System.in);
            Base Otriangle = new Triangle();
            System.out.print("masukkan ukuran alas: ");
            number1 = input.nextDouble();
            System.out.print("masukkan ukuran tinggi: ");
            number2 = input.nextDouble();
            
            Otriangle.set_A(number1);
            Otriangle.set_B(number2);
            Otriangle.view();
            String[] args = null;
            main(args);
        } catch (Exception e) {
            System.out.println("data input harus angka");
            operation_3();
        }
    }
    
    private static void operation_4(){
        try {
            double number1, number2, number3;
            Scanner input = new Scanner(System.in);
            Trapezoidal Otrapezoidal = new Trapezoidal();
            System.out.print("masukkan ukuran sisi atas: ");
            number1 = input.nextDouble();
            System.out.print("masukkan ukuran sisi bawah: ");
            number2 = input.nextDouble();
            System.out.print("masukkan ukuran tinggi: ");
            number3 = input.nextDouble();
            
            Otrapezoidal.set_A(number1);
            Otrapezoidal.set_B(number2);
            Otrapezoidal.set_height(number3);
            Otrapezoidal.view();
            String[] args = null;
            main(args);
            
        } catch (Exception e) {
            System.out.println("data input harus angka");
            operation_4();
        }
    }
    
    private static void operation_5(){
        try {
            double number1, number2;
            Scanner input = new Scanner(System.in);
            Base Oparallelogram = new Parallelogram();
            System.out.print("masukkan ukuran alas: ");
            number1 = input.nextDouble();
            System.out.print("masukkan ukuran tinggi: ");
            number2 = input.nextDouble();
            
            Oparallelogram.set_A(number1);
            Oparallelogram.set_B(number2);
            Oparallelogram.view();
            String[] args = null;
            main(args);
        } catch (Exception e) {
            System.out.println("data input harus angka");
            operation_5();
        }
        
    }
    
}

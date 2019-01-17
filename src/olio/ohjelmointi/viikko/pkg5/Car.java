/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olio.ohjelmointi.viikko.pkg5;

/**
 *
 * @author Samuli
 */
public class Car {
    public Car(){
        System.out.print("Valmistetaan: ");
        Body body=new Body();
        System.out.print("Valmistetaan: ");
        Chassis chassis=new Chassis();
        System.out.print("Valmistetaan: ");
        Engine engine=new Engine();
        int count=0;
        for(int i=0;i<4;i++){
            System.out.print("Valmistetaan: ");
            Wheel wheel= new Wheel();
            count++;
        }
        System.out.println("Autoon kuuluu: ");
        System.out.print("\t");
        body.getBody();
        System.out.print("\t");
        chassis.getChassis();
        System.out.print("\t");
        engine.getEngine();
        System.out.print("\t");
        System.out.print(count+" ");
        Wheel wheel=new Wheel();
}
   class Engine{
    Engine(){
        System.out.println("Engine");
    }
   void getEngine(){
       System.out.println("Engine"); 
    }
}
   class Chassis{
       Chassis(){
           System.out.println("Chassis");
       }
       void getChassis(){
           System.out.println("Chassis");
       }
   }
   class Wheel{
       Wheel(){
           System.out.println("Wheel"); 
       }
       void getWheel(){
           System.out.println("Wheel");
       }
   }
   class Body{
       Body(){
           System.out.println("Body");
       }
       void getBody(){
           System.out.println("Body");
       }
   }
}


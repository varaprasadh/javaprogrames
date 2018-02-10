/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vara
 */
interface Phone{
    void call();
    void play();
    void record();
}
interface Samsung extends Phone{
    
    void details();
}
interface Asus extends Phone{
    void details();
}

class Devoloper implements Phone{
   
     public void call(){
         System.out.println("this will have calliing feature");
     }
     public void play(){
         System.out.println("it can play");
     }
     public void record(){
         System.out.println("omg..it can record as well");
     }
 }

  class SamsungCeo extends Devoloper implements Samsung{
    public void details(){
        System.out.println("this is samsung phone");
    }
}
  class AsusCeo extends Devoloper implements Asus{
    public void details(){
        System.out.println("it is asus..the heater");
    }
}

public class NestedInterface extends Devoloper{
    public static void main(String[] s){
        Phone p=new NestedInterface();
       // p.details();
        p.call();
        p.record();
        p.play();
        Asus asus=new AsusCeo();
        System.out.println("\nreleasing asus:");
        asus.call();
        asus.play();
        asus.call();
        System.out.println("\n releasing samsung:");
        Samsung samsung =new SamsungCeo();
        samsung.call();
        samsung.play();
        samsung.call();
        
    }
}

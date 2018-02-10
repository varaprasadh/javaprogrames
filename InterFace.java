/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vara
 */
interface Demo{
    public abstract void show();
    public void display();
}
abstract class A implements Demo{
 public void show(){
     System.out.println("inside show");
 }
 public void display(){
     System.out.println("inside display!");
 }


}
public class InterFace extends A {
    public static void main(String[] args){
       Demo d=new InterFace();
       d.display();
       d.show();
    }
    
}

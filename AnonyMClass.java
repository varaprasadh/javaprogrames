/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vara
 */
class Add{
    public void doThis(int a ,int b){
        System.out.println("addition here");
        System.out.println(a+b);
    }
    
}

public class AnonyMClass {
    public static void main(String[] args){
    Add obj =new Add();
    obj.doThis(5,6); //reffered to class add
    obj=new Add(){
        public void doThis(int a ,int b){
            System.out.println("substracted here:");
            System.out.println(a-b);
        }
    }; //here it is the anonymous inner class
    obj.doThis(10, 5);
    
    
    
    
    
    
    }
}

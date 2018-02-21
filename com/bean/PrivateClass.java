package com.bean;
public class PrivateClass {
     String str="parent class";
     ChildClass cc;
     public String get(){
        return cc.get();
     }
     public void set(String str){
          cc=new ChildClass();
      cc.set(str);
         }
    
   private class ChildClass{
      
       String str="childclass";
       public void set(String str){
           this.str=str;
          
       }
       public String get(){
           return this.str;
       }
       
       
   }    
}

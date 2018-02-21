
package com.vara;
import com.bean.PublicClass;
import com.bean.PrivateClass;
import com.bean.ProtectedClass;
//import com.bean.DefaultClass; we cant obtain default class properties
//from outside of its package;
//public class can be imported...
//private class cant be  accessed out of class./
//protected class can be accessed by inheritance..
public class AccessMods {

    public static void main(String[] args) {
       PublicClass ams=new PublicClass();
      // DefaultClass dc=new DefaultClass();
       System.out.println(ams.getValue()); //accesing public class
       ams.setValue(20);
       System.out.println(ams.getValue());
       PrivateClass pc=new PrivateClass(); //parent of private class
      // System.out.println(pc.get()); //expected to print "child class..but getting error
       pc.set("string to private class");
       System.out.println(pc.get());
       /*-----------------------------*/
       ProtectedClass pcs=new ProtectedClass();
       pcs.setFname("bean");
       System.out.println(pcs.getFname());
       
       
    }
    
}


/**
 * @author vara
 * we can implement any no of interfaces from one class right;
 * ambiguity occurs when 2 or more interfaces have same method..
 * when we try to call that method ..problem come into picture..
 * lets have a look to solve it..
 * 
 */
// i'm using default methods to directly define methods in inteface..
interface Ios{
    default void call(){
        System.out.println("you are calling from iphone");
    }
   
}
interface Android{
 
       default void call(){
        System.out.println("you are calling from Android!");
      
        }
    
}
//create a class to get things of interface..
 class User implements Ios,Android{
 
  public void play(){
      System.out.println("playing by user");
  }
  //simply override that method in our class and try interfaceName.super.method()
  //to get the concernive method from respected interface;
  
  @Override
  public void call(){
      System.out.println("handled ambiguity condition by class user");
      Ios.super.call();
      Android.super.call();
  }
  
    
}
public class AmbiguityIssue_Interface {
 public static void main(String[] ar){
     User r=new User();
     r.play();
     r.call();
     
 }
    
    
}

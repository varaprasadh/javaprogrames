import java.util.Random;
class SuperClass{

     public int getVolume(int width,int height,int length){
       return width*height*length;
     }
     public int getSquare(int num){
       return num*num;
     }
     public int getRandom(int min,int max){
       Random r =new Random();
       return min+r.nextInt(max-min);
     }
     public void random(int min,int max){
       System.out.println((int)(min+Math.random()*(max-min)));
       System.out.println("2nd try "+(int)(min+Math.random()*(max-min)));
     }
}
class SubClass extends SuperClass{
  public void start(){
    System.out.println("volume with 5,5,5="+getVolume(5,5,5));
    System.out.println("square 5="+getSquare(5));
  for(int i=0;i<5;i++)  System.out.println(" 5 Random numbers from 5 to 50:"+ getRandom(5,50));
    System.out.println("math.random method:\n");
      for(int i=0;i<10;i++){
       System.out.println(" 10 Random numbers from 5 to 50:" );
       random(5,50);}
  }
}
public class InheritMethod{
  public static void main(String args[]){
    SubClass sc=new SubClass();
    sc.start();
  }
}
